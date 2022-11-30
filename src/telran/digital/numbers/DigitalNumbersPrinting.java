package telran.digital.numbers;

public class DigitalNumbersPrinting {
	private static final String SYMBOL = "$";

	public static void displayDigitalNumber(int number, int offset, int width, int height) {
		if(height % 2 != 0 && width > 2) {
		int length = String.valueOf(number).length();
		String[] res = enptyLine(height);
		int interval = offset;
		for (int i = length; i > 0; i--) {
			switch ((int) (number / Math.pow(10, i - 1))) {
			
			case 0: res = symvol(res, zero(interval, width, height)); break;
			case 1:	res = symvol(res, one(interval, width, height)); break;
			case 2:	res = symvol(res, two(interval, width, height)); break;
			case 3:	res = symvol(res, three(interval, width, height)); break;
			case 4:	res = symvol(res, four(interval, width, height)); break;
			case 5:	res = symvol(res, five(interval, width, height)); break;
			case 6:	res = symvol(res, six(interval, width, height)); break;
			case 7: res = symvol(res, seven(interval, width, height)); break;
			case 8: res = symvol(res, eight(interval, width, height)); break;
			case 9:	res = symvol(res, nine(interval, width, height)); break;
			
			}
			number = number % (int) Math.pow(10, i - 1);
			interval = 5;
		}
		displayStrings(res);
	} else {
		System.out.println("Incorrect digit size entered");
	}
	}

	private static String[] enptyLine(int length) {
		String[] res = new String[length];
		for (int i = 0; i < length; i++) {
			res[i] = "";
		}
		return res;
	}

	private static String[] symvol(String[] lines, String[] digit) {
		for (int i = 0; i < lines.length; i++) {
			lines[i] = lines[i] + digit[i];
		}
		return lines;
	}

	public static String line(int offset, int length) {
		return " ".repeat(offset) + SYMBOL.repeat(length);

	}

	public static String[] verticalLine(int offset,  int height) {
		String[] res = new String[height];
		for (int i = 0; i < res.length; i++) {
			res[i] = " ".repeat(offset) + SYMBOL;

		}
		return res;
	}

	public static String[] twoVerticalLines(int offset, int width, int height) {
		String[] res = new String[height];
		for (int i = 0; i < res.length; i++) {
			res[i] = " ".repeat(offset) + SYMBOL + " ".repeat(width - 2) + SYMBOL;
		}
		return res;
	}

	public static String[] zero(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String[] lines = twoVerticalLines(offset, width, height - 2);
		System.arraycopy(lines, 0, res, 1, lines.length);
		res[height - 1] = line(offset, width);
		return res;

	}

	public static String[] one(int offset, int width, int height) {
		return verticalLine(offset + width - 1, height);
	}

	public static String[] two(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String line[] = verticalLine(offset + width - 1, height / 2 - 1);
		System.arraycopy(line, 0, res, 1, line.length);
		res[height / 2] = line(offset, width);
		String Secondline[] = SeсondVerticalLine(offset, width, height - height / 2 - 2);
		System.arraycopy(Secondline, 0, res, height / 2 + 1, Secondline.length);
		res[height - 1] = line(offset, width);
		return res;
	}
	public static String[] SeсondVerticalLine(int offset, int width, int height) {
		String[] res = new String[height];
		for (int i = 0; i < res.length; i++) {
			res[i] = " ".repeat(offset) + SYMBOL+ " ".repeat(width - 1);

		}
		return res;
	}

	public static String[] three(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String line[] = verticalLine(offset + width - 1, height / 2 - 1);
		System.arraycopy(line, 0, res, 1, line.length);
		res[height / 2] = line(offset, width);
		String Secondline[] = verticalLine(offset + width - 1, height - height / 2 - 2);
		System.arraycopy(Secondline, 0, res, height / 2 + 1, Secondline.length);
		res[height - 1] = line(offset, width);
		return res;
	}

	public static String[] four(int offset, int width, int height) {
		String[] res = new String[height];
		String lines[] = twoVerticalLines(offset, width, height / 2);
		System.arraycopy(lines, 0, res, 0, lines.length);
		res[height / 2] = line(offset, width);
		String line[] = verticalLine(offset + width - 1, height - height / 2 - 1);
		System.arraycopy(line, 0, res, height / 2 + 1, line.length);
		return res;
	}

	public static String[] five(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String Secondline[] = SeсondVerticalLine(offset, width, height / 2 - 1);
		System.arraycopy(Secondline, 0, res, 1, Secondline.length);
		res[height / 2] = line(offset, width);
		String line[] = verticalLine(offset + width - 1, height - height / 2 - 2);
		System.arraycopy(line, 0, res, height / 2 + 1, line.length);
		res[height - 1] = line(offset, width);
		return res;
	}

	public static String[] six(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String Secondline[] = SeсondVerticalLine(offset, width, height / 2 - 1);
		System.arraycopy(Secondline, 0, res, 1, Secondline.length);
		res[height / 2] = line(offset, width);
		String lines[] = twoVerticalLines(offset, width, height - height / 2 - 2);
		System.arraycopy(lines, 0, res, height / 2 + 1, lines.length);
		res[height - 1] = line(offset, width);
		return res;
	}

	public static String[] seven(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String line[] = verticalLine(offset + width - 1, height - 1);
		System.arraycopy(line, 0, res, 1, line.length);
		return res;
	}

	public static String[] eight(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String lines[] = twoVerticalLines(offset, width, height / 2 - 1);
		System.arraycopy(lines, 0, res, 1, lines.length);
		res[height / 2] = line(offset, width);
		String Secondslines[] = twoVerticalLines(offset, width, height - height / 2 - 2);
		System.arraycopy(Secondslines, 0, res, height / 2 + 1, Secondslines.length);
		res[height - 1] = line(offset, width);
		return res;
	}

	public static String[] nine(int offset, int width, int height) {
		String[] res = new String[height];
		res[0] = line(offset, width);
		String lines[] = twoVerticalLines(offset, width, height / 2 - 1);
		System.arraycopy(lines, 0, res, 1, lines.length);
		res[height / 2] = line(offset, width);
		String line[] = verticalLine(offset + width - 1, height - height / 2 - 2);
		System.arraycopy(line, 0, res, height / 2 + 1, lines.length);
		res[height - 1] = line(offset, width);
		return res;
	}

	public static void displayStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

	}
}