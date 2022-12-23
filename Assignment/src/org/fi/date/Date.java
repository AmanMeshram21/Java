package org.fi.date;

public class Date {

	private int day;
	private int month;
	private int year;
	
//	private int monthDays[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date() {
		day = month = 1;
		year = 2022;
	}
	
	public Date(int tmpDay, int tmpMonth, int tmpYear) throws DateException
	{
		setDate(tmpDay,tmpMonth,tmpYear);
	}
	

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDate(int tmpDay, int tmpMonth, int tmpYear) {

		if (tmpYear < 1900 || tmpYear > 3000) {
			year = 2022;
		} else {
			year = tmpYear;
		}

		if (tmpMonth < 1 || tmpMonth > 12) {
			month = 1;
		} else {
			month = tmpMonth;
		}

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (tmpDay < 1 || tmpDay > 31) {
				day = 1;
			} else {
				day = tmpDay;
			}
		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (tmpDay < 1 || tmpDay > 30) {
				day = 1;
			} else {
				day = tmpDay;
			}
		}

		if (month == 2) {
			if (year % 4 == 0) {
				if (tmpDay < 1 || tmpDay > 29) {
					day = 1;
				} else {
					day = tmpDay;
				}
			} else {
				if (tmpDay < 1 || tmpDay > 28) {
					day = 1;
				} else {
					day = tmpDay;
				}

			}
		}

	}

	public void addDays(int noOfDays) {

		for (int i = 0; i < noOfDays; i++) {

			if (year >= 1900 && year <= 3000) {

				if (month <= 12) {

					if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
							|| month == 12) {
						if (day <= 31) {
							day++;

						} if(day > 31) {
							month++;
							day = 1;
						}

					}

					else if (month == 4 || month == 6 || month == 9 || month == 11) {
						if (day <= 30) {
							day++;

						} if (day > 30) {
							day = 1;
							month++;

						}
					}

					else if (month == 2) {
						if (year % 4 == 0) {
							if (day <= 29) {
								day++;

							} if(day>29) {
								day = 1;
								month++;

							}
						}  
						else if (day <= 28) {
								day++;

							} if(day>28) {
								month++;
								day = 1;
							}
					}

				} // if month
				if (month > 12) {
					year++;
					month = 1;
					day = 1;
				}

			} // if year

		} // for loop

		System.out.println(day + "/" + month + "/" + year);
	} // addDays

	public void addMonths(int noOfMonths) {

		for (int i = 0; i < noOfMonths; i++) {

			if (month > 12) {
				month = 1;
				year++;

			}
			if (month <= 12) {
				month++;

				if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (day > 30) {
						day = 30;
					}

				}

				if (month == 2) {
					if (year % 4 == 0) {
						if (day > 29) {
							day = 29;

						}

					} else {
						if (day > 28) {
							day = 28;

						}

					}

				}

			} // if month
		} // for loop

		System.out.println(day + "/" + month + "/" + year);
	}// addMonths

	public void addYear(int noOfYears) {

		for (int i = 0; i < noOfYears; i++) {

			if (year >= 1900 && year <= 3000) {
				year++;

				if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (day > 30) {
						day = 30;
					}

				}

				if (month == 2) {
					if (year % 4 == 0) {
						if (day > 29) {
							day = 29;

						}

					} else {
						if (day > 28) {
							day = 28;

						}

					}

				}
			}

			else {
				System.out.println("InVAlid");
			}

		} // for loop
		System.out.println(day + "/" + month + "/" + year);
	} // addYears

}// Class
