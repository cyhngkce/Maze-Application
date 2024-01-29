/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labirent4;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author cyhngkce
 */
public class ızgara2 {
    
    Integer[][] yol;

    public ızgara2() {
        this.yol = new Integer[200][200];
        
    }
    
    public void ızgaraolustur(int boyut) {
        
        boyut =boyut+2;
       
        int i, j;

        for (i = 0; i < boyut; i++) {
            for (j = 0; j < boyut; j++) {

                yol[i][j] = 0;
            }
        }

        for (i = 0; i < boyut; i++) {
            yol[0][i] = 2;
            yol[i][0] = 2;
            yol[boyut - 1][i] = 2;
            yol[i][boyut - 1] = 2;
        }
        yol[1][1] = 1;
        //yol[boyut - 2][boyut - 2] = 1; while( i != (boyut - 2) && j != (boyut - 2))

        Random r = new Random();

        i = 1;
        j = 1;
        while (yol[boyut - 2][boyut - 2] != 1) {
            int a = r.nextInt(6);

            if (a == 0 && i != boyut - 2) {
                i++;
                yol[i][j] = 1;
            } else if (a == 0 && i == boyut - 2) {
                j++;
                yol[i][j] = 1;
            } else if (a == 1 && j != boyut - 2) {
                j++;
                yol[i][j] = 1;
            } else if (a == 1 && j == boyut - 2) {
                i++;
                yol[i][j] = 1;
            } else if (a == 2 && i != 1) {
                i--;
                yol[i][j] = 1;
            } else if (a == 2 && i == 1) {
                i++;
                yol[i][j] = 1;
            } else if (a == 3 && j != 1) {
                j--;
                yol[i][j] = 1;
            } else if (a == 3 && j == 1) {
                j++;
                yol[i][j] = 1;
            } else if (a == 4 && i != boyut - 2) {
                i++;
                yol[i][j] = 1;
            } else if (a == 4 && i == boyut - 2) {
                j++;
                yol[i][j] = 1;
            } else if (a == 5 && j != boyut - 2) {
                j++;
                yol[i][j] = 1;
            } else if (a == 5 && j == boyut - 2) {
                i++;
                yol[i][j] = 1;
            }
           // System.out.println("i: " + i);
           // System.out.println("j: " + j);
        }

        Random r2 = new Random();

        for (i = 0; i < boyut; i++) {
            for (j = 0; j < boyut; j++) {
                if (yol[i][j] == 0) {
                    int b = r.nextInt(2);
                    if (b == 0 ) {
                        yol[i][j] = 2;
                    }
                }

            }
        }
        
        
        for (i = 0; i < boyut; i++) {
            for (j = 0; j < boyut; j++) {
                System.out.print(yol[i][j]);
            }
            System.out.print("\n");
        }
        yol[1][1]=4;
        yol[boyut-2][boyut-2]=5;
        JFrame frame=new JFrame();
     JPanel btnpanel= new JPanel();
     
     
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setBounds(0, 0, 1000, 1000);
     Container container=frame.getContentPane();
     container.setLayout(null);
     int sayi=0;
     for ( i = 0; i < boyut; i++) {
        for ( j = 0; j < boyut; j++) {
        if(yol[i][j]==1){
            yol[i][j]=0;
        
        }
        
        }}
     for ( i = 0; i < boyut; i++) {
        for ( j = 0; j < boyut; j++) {
            
            if(yol[i][j]==0 ){
                   JButton btn = new JButton("0");
              btn.setBackground(Color.WHITE);
              btn.setBounds(sayi*50,i*30, 50, 30);
              btnpanel.add(btn);
              container.add(btn);
              sayi++;
            }
            else if(yol[i][j]==1){
             JButton btn1 = new JButton("1");
              btn1.setBackground(Color.WHITE);
             btn1.setBounds(sayi*50,i*30, 50, 30);
              btnpanel.add(btn1);
              container.add(btn1);
             sayi++;}
            else if(yol[i][j]==2){
                    JButton btn2 = new JButton("2");
              btn2.setBackground(Color.RED);
             btn2.setBounds(sayi*50,i*30, 50, 30);
              btnpanel.add(btn2);
              container.add(btn2);
             sayi++;}
            else if(yol[i][j]==4){
                    JButton btn2 = new JButton("2");
              btn2.setBackground(Color.PINK);
             btn2.setBounds(sayi*50,i*30, 50, 30);
              btnpanel.add(btn2);
              container.add(btn2);
             sayi++;}
            else if(yol[i][j]==5){
                    JButton btn2 = new JButton("5");
              btn2.setBackground(Color.BLUE);
             btn2.setBounds(sayi*50,i*30, 50, 30);
              btnpanel.add(btn2);
              container.add(btn2);
             sayi++;}
             
            
                     
        }
        sayi=0;
       
    }
     frame.setVisible(true);
    
    
    
             
    }
            
    
}
