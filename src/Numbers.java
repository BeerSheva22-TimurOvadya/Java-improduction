
public class Numbers {
static public int getNdigits(long number) {
	int res = 0;
	do {
		number /= 10;
		res++;
	} while(number != 0);
	return res;
}

/**
 * 
 * @param number
 * @return true only if number comprises of 6 digits
 * and sum of first three digits equals the sum of last three digits
 */
static public boolean isHappyNumber(int number) {
	boolean HappyNum = false;
	if (getNdigits(number) == 6) {
		int leftSum = 0;
		int rightSum = 0;
		for (int i = 1; i <= 100000; i = i* 10) {
			if (i <= 100) {
				rightSum = (rightSum + (number / i)) % 10;
			} else {
				leftSum = (leftSum + (number / i)) % 10;
			}
		}
		if (leftSum == rightSum) {
			HappyNum = true;
		}
	}
	return HappyNum ;
}

}

    