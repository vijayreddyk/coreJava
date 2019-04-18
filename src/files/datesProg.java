package files;

import java.util.Arrays;
import java.util.Calendar;

public class datesProg {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int month = Calendar.MONTH;
		int year = calendar.get(Calendar.YEAR);
		if(day<=15) {
			//printPreviousHalfs(2,3,2020);
			printPreviousHalfs(day,month,year);
		} else {
			printDifferentMonthHalfs(day,month,year);
		}
	}

	private static void printDifferentMonthHalfs(int day, int month, int year) {
		int previous_month = 0;
		int number_of_days_prev_month;
		int knuckleMonths[] = {1,3,5,7,8,10,12};
		int grooveMonths[] = {4,6,9,11};
		int year1 = 0;
		if(month>1) {
			year1 = year;
			previous_month = month - 1;
		} else {
			year1 = year - 1;
			previous_month = 12;
		}
		if(Arrays.binarySearch(knuckleMonths, previous_month)>=0) {
			number_of_days_prev_month = 31;
		} else if(Arrays.binarySearch(grooveMonths, previous_month)>=0){
			number_of_days_prev_month = 30;
		} else {
			if(year%4==0) {
				number_of_days_prev_month = 29;
			} else {
				number_of_days_prev_month = 28;
			}
		}
		System.out.println("16 - "+previous_month+" - "+year1+"<==>"+number_of_days_prev_month+" - "+previous_month+" - "+year1);
		System.out.println("1  - "+month+" - "+year1+"<==>15 - "+month+" - "+year1);
	}

	private static void printPreviousHalfs(int day, int month, int year) {
		int previous_month = 0;
		int number_of_days_prev_month;
		int knuckleMonths[] = {1,3,5,7,8,10,12};
		int grooveMonths[] = {4,6,9,11};
		int year1 = 0;
		if(month>1) {
			year1 = year;
			previous_month = month - 1;
		} else {
			year1 = year - 1;
			previous_month = 12;
		}
		if(Arrays.binarySearch(knuckleMonths, previous_month)>=0) {
			number_of_days_prev_month = 31;
		} else if(Arrays.binarySearch(grooveMonths, previous_month)>=0){
			number_of_days_prev_month = 30;
		} else {
			if(year%4==0) {
				number_of_days_prev_month = 29;
			} else {
				number_of_days_prev_month = 28;
			}
		}
		System.out.println("1 - "+previous_month+" - "+year1+"<==>15 - "+previous_month+" - "+year1);
		System.out.println("16 - "+previous_month+" - "+year1+"<==>"+number_of_days_prev_month+" - "+previous_month+" - "+year1);
	}

}
