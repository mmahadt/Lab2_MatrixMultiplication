/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2matrixmultiplicationn;

import java.util.Scanner;

/**
 *
 * @author mmahad.bese14seecs
 */
public class MatrixMultiplier {
   private int mat1Row, mat1Col, mat2Row, mat2Col,sum = 0;
    public void multiply(){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of fist matrix in this format: row<Space>column");

        mat1Row = scan.nextInt();

        mat1Col = scan.nextInt();//getting values from the user

        int first[][] = new int[mat1Row][mat1Col];//First matrix 2d array

        System.out.println("Enter the elements of first matrix.\nPlease be careful while inputting a matrix.\n"
                + "*Seperate the row elements by \"Spaces\" and to proceed to next column \n"
                + "*Press \"Enter\" ");

        for (int i = 0; i < mat1Row; i++) {
            for (int j = 0; j < mat1Col; j++) {
                first[i][j]
                        = scan.nextInt();//populating the matrix
            }
        }

        System.out.println("Enter the number of rows and columns of second matrix");

        mat2Row = scan.nextInt();

        mat2Col = scan.nextInt();//rows and cols of mat2

        if (mat1Col != mat2Row) {

            System.out.print("These matrices are not compatible for multiplication");

            return;

        } else {//check if mtrices are eligible for multiplication
            int second[][] = new int[mat2Row][mat2Col];

            int multiply[][] = new int[mat1Row][mat2Col];

            System.out.println("Enter the elements of second matrix");

            for (int i = 0; i < mat2Row; i++) {
                for (int j = 0; j < mat2Col; j++) {
                    second[i][j]
                            = scan.nextInt();//reading the input of mat2 in form of rows and cols
                }
            }

            //The main code for iteration method lies here
            for (int i = 0; i < mat1Row; i++) {
                for (int j = 0; j < mat2Col; j++) {
                    for (int k = 0; k < mat1Col; k++) {
                        sum = sum + first[i][k] * second[k][j];
                    }

                    multiply[i][j] = sum;
                    sum = 0;
                }
            }
            
            System.out.println("Product of entered matrices:-");

            for (int c = 0; c < mat1Row; c++) {
                for (int d = 0; d < mat2Col; d++) {
                    System.out.print(multiply[c][d] + "\t");
                }

                System.out.print("\n");
            }

        }
    }
}
