
1 package etkinlik6;
2
3 public class ikiboyutludiziler {
4
5 public static void main(String[] args) {
6
7 int [][] dizi = new int [2][3];
8
9 dizi[0][0]=10;
10 dizi[0][1]=20;
11 dizi[0][2]=30;
12 dizi[1][0]=40;
13 dizi[1][1]=50;
14 dizi[1][2]=60;
15 // int [][] dizi = { {1,3,5} , {2,4,6} };
16
17 for (int i=0; i<2; i++)
18 {
19 for (int j=0; j<3; j++)
20 {
21 System.out.print(dizi [i][j] +" ");
22 }
23 System.out.println();
24 }
25 }
26 }
