import java util.*;
import java.lang.*;
class baru{
    static int i,j,k,l,count=6,c=1,c1=10,c2=1,c3=10,c4=11,c5=0,c6=8,a=10;
    static void line() {//create line
        for(k=0;k<=2;k++)
        {
            System.out.printf("*");
        }
    }
    static void gap() {//cretae space
        for(k=0;k<=2;k++){
            System.out.printf(" ");
        }
    }
    static void crosstr() {//cross triangle top (right)
        for(j=10;j>=i;j--){
            System.out.printf(" ");
        }
    }
    static void crosstl(){//same top triangle (left)
        for(j=10;j>=i;j--){
            System.out.printf(" ");
        }
    }
    static void crossbr(){//cross triangel bottom (right)
        for (l=1;l<=i;l++){
            System.out.printf(" ");
        }
    }
    static void crossbl(){//same bottom triangle
        for(j=1;j<=i;j++){
            System.out.printf(" ");
        }
    }
    static void mida(){//middle part of A
        for(l=1;l<=i;l++){

        }
    }
}