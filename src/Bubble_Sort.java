//第一次2021/12/9
//冒泡排序第一次
//　冒泡排序属于一种典型的交换排序。
//交换排序顾名思义就是通过元素的两两比较，判断是否符合要求，如过不符合就交换位置来达到排序的目的。
// 冒泡排序名字的由来就是因为在交换过程中，类似水冒泡，小（大）的元素经过不断的交换由水底慢慢的浮到水的顶端。
//冒泡排序的思想就是利用的比较交换，利用循环将第 i 小或者大的元素归位，归位操作利用的是对 n 个元素中相邻的两个进行比较，
// 如果顺序正确就不交换，如果顺序错误就进行位置的交换。通过重复的循环访问数组，直到没有可以交换的元素，那么整个排序就已经完成了。
//
//
//1.原理：比较两个相邻的元素，将值大的元素交换到右边
//2.思路：依次比较相邻的两个数，将比较小的数放在前面，比较大的数放在后面。
//(1)第一次比较：首先比较第一和第二个数，将小数放在前面，将大数放在后面。
//(2)比较第2和第3个数，将小数 放在前面，大数放在后面。
//......
//(3)如此继续，知道比较到最后的两个数，将小数放在前面，大数放在后面，重复步骤，直至全部排序完成
//(4)在上面一趟比较完成后，最后一个数一定是数组中最大的一个数，所以在比较第二趟的时候，最后一个数是不参加比较的。
//(5)在第二趟比较完成后，倒数第二个数也一定是数组中倒数第二大数，所以在第三趟的比较中，最后两个数是不参与比较的。
//(6)依次类推，每一趟比较次数减少依次
//日期


public class Bubble_Sort {
    public static void main(String[] args) {
        int[] list = {3,4,1,5,2};
        int temp = 0; // 开辟一个临时空间, 存放交换的中间值
        // 要遍历的次数
        for (int i = 0; i < list.length-1; i++) {
            System.out.format("第 %d 遍：\n", i+1);
            //依次的比较相邻两个数的大小，遍历一次后，把数组中第i小的数放在第i个位置上
            for (int j = 0; j < list.length-1-i; j++) {
                // 比较相邻的元素，如果前面的数小于后面的数，就交换
                if (list[j] < list[j+1]) {
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                }
                System.out.format("第 %d 遍的第%d 次交换：", i+1,j+1);
                for(int count:list) {
                    System.out.print(count);
                }
                System.out.println("");
            }
            System.out.format("第 %d 遍最终结果：", i+1);
            for(int count:list) {
                System.out.print(count);
            }
            System.out.println("\n#########################");
        }
    }
}


//核心算法代码
//    public void BubbleSort(int[] arr){
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=0;j<arr.length-1-i;j++){
//                if(arr[j]>arr[j+1]){ //相邻两个元素作比较，如果前面元素大于后面，进行交换
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }