/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labirent4;

/**
 *
 * @author cyhngkce
 */
public class robot2 extends ızgara2 {
    public void sol(int satir,int sutun){
        int i,j,a;
        i=satir;
        j=sutun;
        a=j-1;
        
        yol[i][a]=yol[i][j];
        yol[i][j]=6;
        
    }
    public void sag(int satir,int sutun){
    int i,j,a;
        i=satir;
        j=sutun;
        a=j+1;
       
       yol[i][a]=yol[i][j];
    yol[i][j]=6;
    }
    public void yukari(int satir,int sutun){
    int i,j,a;
        i=satir;
        j=sutun;
        a=i-1;
        yol[a][j]=yol[i][j];
        yol[i][j]=6;
      }
    public void asagi(int satir,int sutun){
    int i,j,a;
   
        i=satir;
        j=sutun;
        a=i+1;
        yol[a][j]=yol[i][j];
        yol[i][j]=6;
    }
    public void basla(){
    for(int i=1;i< boyut-1;i++){
                for(int j=1;j<boyut-1;j++){
                    if(yol[i][j-1]!=5 || yol[i-1][j]!=5|| yol[i][j+1]!=5 || yol[i+1][j]!=5 ||yol[i][j]!=5){
              if(yol[i][j]==4){ 
                  int a,b,c,d;
                  a=i+1;
                  b=j+1;
                  c=i-1;
                  d=j-1;
         
             
                     if(yol[a][j]==0){
                      
            asagi(i,j);
            ızgaraOlustur();
            }
                         else if(yol[i][b]==0){
                
            sag(i,j);
            ızgaraOlustur();
           
            }
             
            else if(yol[c][j]==0){
            yukari(i,j);
            ızgaraOlustur();
            
            }
            
            else if(yol[i][d]==0){
            sol(i,j);
            ızgaraOlustur();
            
            }       
           
            
                  
                  }
                
                }
                }
            }
    
    
    
    }
    
}
