import java.util.*;

public class pattern {
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    static void pattern5(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern8(int n){
        for(int i=n;i>=0;i--){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    static void pattern9(int n){
        for(int i=0;i<=n;i++){
            for(int k=0;k<=n-i-1;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<=n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        } 
        for(int i=n;i>=0;i--){
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
    int start =1;
    for(int i=0;i<n;i++){
        if(i%2==0){
            start=1;
        }
        else{
            start=0;
        }
        for(int j=0;j<=i;j++){
            System.out.print(start);
            start=1-start;
        }
        System.out.println();
    }

}
    static void pattern12(int n){
    int space= 2 * (n-1);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        // }}
        // System.out.println();
        for(int k=1;k<=space;k++){
            System.out.print("  ");
        }
        for(int l=i;l>=1;l--){
            System.out.print(l+" ");
        }
        // for(int k=0;k<2*n-i;k++){
        //     System.out.print(" ");
        // }
        System.out.println();
        space-=2;
    }

  } 
    static void pattern13(int  n){
    int start=1;
    for(int i=1;i<=n;i++){
     
        for(int j=1;j<=i;j++){
            System.out.print(start+" ");
            start+=1;
            
        }
        System.out.println();
    }

}
    static void pattern14(int n){
    // char ch='A';
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)('A'+j));
            // ch+=1;
        }
        System.out.println();
    }

}
    static void pattern15(int n){
    char ch='A';
     for(int i=n;i>=0;i--){
        for(int j=0;j<=i;j++){
            System.out.print((char)(ch+j));
        }
        System.out.println();
     }
}
    static void  pattern16(int n){
    for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)('A'+i));

        }
        System.out.println();
    }

}
    static void pattern17(int n){
    for(int i=0;i<=n;i++){
        for(int k=0;k<=n-i-1;k++){
            System.out.print(" ");
        }
        char ch='A';
        int breakpoint=(2*i +1)/2;
        for(int j=0;j<2*i +1;j++){
            System.out.print((char)(ch+j));
            if(j<=breakpoint) {
                ch++;
            }
            else 
            {
                ch--;
            }
        }
       
        // for(int k=0;k<n-i-1;k++){
        //     System.out.print("");
        // }
        // for(int j=i;j>=0;j--){
        //     System.out.print((char)('A'+j));
        // }
      
       
        for(int k=0;k<n-i-1;k++){
            System.out.print(" ");
        }
        System.out.println();
        
    }


    // for(int i=0;i<n;i++){
        
    //     System.out.println();
    // }


}
    static void pattern18(int n){
    char ch='A';
    for(int i='A';i>='E';i++){
        for(int j=0;j<=i;j++){
            System.out.print((char)(ch));  
            ch++;
        }
        System.out.println();


    }
}


public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // int t=s.nextInt();
        // for(int i=0;i<t;i++){
            int n=s.nextInt();

            // pattern1(n); //it is were the backend check all the testcase
            // pattern2(n);
            // pattern3(n);
            // pattern4(n);
            // pattern5(n);
            // pattern6(n); 
            // pattern7(n);
            // pattern8(n);
            // pattern9(n);  
            // pattern10(n);
            // pattern11(n);
            // pattern12(n);
            // pattern13(n);
            // pattern14(n);
            // pattern15(n);
            // pattern16(n);
            // pattern17(n);
            pattern18(n);

        // }
    }}
