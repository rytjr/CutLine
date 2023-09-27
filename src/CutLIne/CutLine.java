package CutLIne;
import java.io.*;
import java.util.*;

/* 2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 
$N$명의 학생들이 응시했다.

이들 중 점수가 가장 높은 
$k$명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.

커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다. */

public class CutLine {
	public static void main(String[] args) throws IOException {
		
		/* 이번 문제에서는 Scanner대신 Buffer를 사용하여 입력받고 입력받은 값을 정렬 후 커트라인을 찾아주었다 */
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[num1];
		
		String d = bf.readLine();
		StringTokenizer ss = new StringTokenizer(d);
		
		
		for(int i = 0; i < num1; i++) {
			arr[i] = Integer.parseInt(ss.nextToken());
		}
		
		for(int i =0; i < num1; i++) {
			for(int j = 0; j < num1; j++) {
				if(arr[i] < arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		bw.write(String.valueOf(arr[num1 - num2]));
		bw.flush();
		bw.close();
		
	}

}
