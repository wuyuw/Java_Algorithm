package yaowu.sparsearray;

import java.io.*;

public class SparseArray {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建一个原始的二维数组 11x11
        // 1表示黑子，2表示白子
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        // 打印原始数组
        for(int[] row: chessArr1) {
            for (int i : row) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
        // 将原始二维数组转换成稀疏数组
        // 获取原始二维数组非零数量
        int sum = 0;
        for (int[] ints : chessArr1) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if (ints[j] != 0) {
                    sum++;
                }
            }

        }
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = chessArr1.length;
        sparseArr[0][1] = chessArr1[0].length;
        sparseArr[0][2] = sum;
        // 遍历原始二维数组，将非零值填入sparsArr;
        int count = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if (chessArr1[i][j] != 0) {
                    count ++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        // 打印稀疏数组
        for (int[] ints : sparseArr) {
            for (int i : ints) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("map.data"));
        oos.writeObject(sparseArr);
        oos.close();

        // 从oos读取稀疏数组
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("map.data"));
        int[][] sparseArr2 = (int[][]) ois.readObject();

        // 将稀疏数组还原成二维数组
        int[][] chessArr2 = new int[sparseArr2[0][0]][sparseArr2[0][1]];
        for (int i = 1; i < sparseArr2.length; i++) {
            chessArr2[sparseArr2[i][0]][sparseArr2[i][1]] = sparseArr2[i][2];
        }
        // 打印二维数组
        for (int[] ints : chessArr2) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }

    }
}
