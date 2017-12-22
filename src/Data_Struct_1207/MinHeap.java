import java.util.Scanner;

public class MinHeap {
    static int n;
    static int MinNo = 16 ;
    static int data[];

    public static void main(String[] args) {
            int h = 1;  // 計算MinHeap 高度
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            data = new int[n];

            if (n == 1) h=1;
            if (n >= 2 &&n <=3 ) h = 2;
            if (n >= 4 &&n <=7 ) h = 3;
            if (n >= 8 &&n <=15 ) h = 4;

            int tno = 1;
            for (int i = 1;i<h;i++)  // 計算陣列表示法所需的實際空間大小 tno = 2^h
            {
                tno*=2;
            }

            int MinHeap[] = new int [MinNo];
            for(int i=0;i<MinNo;i++)
            {
                MinHeap[i] = 0;
            }

            int size = 0;
            int position = 0;

        f1(MinHeap, size, n, data);
        System.out.printf("%d\n",h);

        for(int i=0;i<tno;i++)
        {
            System.out.printf("%d ",MinHeap[i]);
        }




    }

    static void f1(int[] minHeap, int size, int n, int[] data) {
        int position;
        for (int i = 0; i < n; i++)
        {
            // 加入前 MinHeap 有size 筆資料
            position = ++size ;
            minHeap[position] = data[i];
            if (i>=1)  //除了樹根不需調整之外，其他節點需檢查是否需要調整
            {
                while (position>1)
                {
                    int parent  = position/2;
                    if (minHeap[position] < minHeap[parent])
                    {
                        //交換
                        int temp = minHeap[position];
                        minHeap[position] = minHeap[parent];
                        minHeap[parent] = temp;
                    }
                    position = parent;
                }
            }
        }
    }


}
