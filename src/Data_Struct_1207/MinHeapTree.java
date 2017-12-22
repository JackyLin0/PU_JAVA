import java.util.Scanner;

public class MinHeapTree {

    static int n;
    static int MinNo = 16; // 輸入資料筆數最多為 n = 15
    // 儲存陣列表示法所需的儲存空間 MinNo = 15+1

    // 輸入的正整數記錄在 data[] 中
    static int data[];

    public static void main(String[] args) {
        int h = 1; // 記錄 Min Heap 的高度

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        data = new int[n];
        for (int i = 0; i < n; i++)
            data[i] = sc.nextInt();

        if (n == 1)
            h = 1;
        if ((n >= 2) && (n <= 3))
            h = 2;
        if ((n >= 4) && (n <= 7))
            h = 3;
        if ((n >= 8) && (n <= 15))
            h = 4;

        int tno = 1;

        for (int i = 1; i <= h; i++) // 計算陣列表示法所需的實際空間大小 tno = 2^h
            tno *= 2;


        int MinHeap[] = new int [MinNo];
        for(int i=0;i<MinNo;i++)
            MinHeap[i] = 0;

        int size = 0;
        int position = 0;

        for (int i = 0 ;i<n;i++)
        {
             position = ++size; // 加入前有size 筆資料
             MinHeap[position] = data[i];

             if (i >=1)  // 第一筆後才需要調整
             {
                    while (position >1)
                    {
                        int parent = position/2;
                        if (MinHeap[position] <= MinHeap[parent])
                        {
                            int temp = MinHeap[position];
                            MinHeap[position] = MinHeap[parent];
                            MinHeap[parent] = temp;
                        }
                        position = parent;
                    }
             }
        }

        System.out.printf("%d\n",h);

        for(int i=0;i<tno;i++)
        {
            System.out.printf("%d ",MinHeap[i]);
        }

    }

}
