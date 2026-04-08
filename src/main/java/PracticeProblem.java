/*
File Name: Lesson 4.1 - While Loops
Author: Alex Liang
Date Created: April 8, 2026
Date Last Modified: April 8, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

		public static String seriesInclusive(int num){
			int i = 1;
			String series = "";
			while (i <= num){
				series = series + i + " ";
				i++;
			}
			series = series.trim();
			return series;
		}

		public static String seriesExclusive(int num){
			int i = 0;
			String series = "";
			while (i < num){
				series = series + i + " ";
				i++;
			}
			series = series.trim();
			return series;
		}

}
