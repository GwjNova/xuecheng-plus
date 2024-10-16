package com.xuecheng.content.api;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 创建一个 Scanner 对象，用于从控制台读取输入。
        int c = scanner.nextInt();
        // 读取用户输入的一个整数，赋值给变量 c。
        int sqrtC = (int) Math.sqrt(c);
        // 计算输入整数 c 的平方根，并取整，将结果赋值给变量 sqrtC。
        boolean found = false;
        // 创建一个布尔变量 found，初始值为 false，表示尚未找到满足条件的 a 和 b。
        // 优化循环顺序，先从较大的数开始找，减少循环次数
        for (int a = sqrtC; a >= 0; a--) {
            // 从 sqrtC 开始递减循环遍历 a 的可能取值。
            int bSquared = c - a * a;
            // 计算 b 的平方值，即 c 减去 a 的平方。
            int b = (int) Math.sqrt(bSquared);
            // 计算 bSquared 的平方根，并取整，得到可能的 b 的值。
            if (b * b == bSquared) {
                // 判断 b 的平方是否等于 bSquared，如果相等则找到了满足条件的 a 和 b。
                found = true;
                // 将 found 设为 true，表示找到了满足条件的解。
                System.out.println(a + "," + b);
                // 输出满足条件的 a 和 b。
                break;
                // 跳出循环，因为已经找到了一组解。
            }
        }
        if (!found) {
            // 如果在循环中没有找到满足条件的解。
            System.out.println(-1);
            // 输出 -1，表示不存在满足条件的 a 和 b。
        }
    }
}