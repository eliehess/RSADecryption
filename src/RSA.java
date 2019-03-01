import java.math.BigInteger;

public class RSA {
	private final static BigInteger one = new BigInteger("1");
	private final static BigInteger hundred = new BigInteger("100");
	private BigInteger privateKey;
	private BigInteger publicKey;
	private BigInteger modulus;

	RSA() {
		BigInteger p = new BigInteger("1237545686962546179487299041121215673698466019");
		BigInteger q = new BigInteger("1420733280999866549081942931210996189788721599");
		BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));

		modulus = p.multiply(q);
		publicKey = new BigInteger("65537");
		privateKey = publicKey.modInverse(phi);
	}

	BigInteger encrypt(BigInteger message) {
		return message.modPow(publicKey, modulus);
	}

	BigInteger decrypt(BigInteger encrypted) {
		return encrypted.modPow(privateKey, modulus);
	}

	public String toString() {
		String fin = "";
		fin += "public  = " + publicKey + "\n";
		fin += "private = " + privateKey + "\n";
		fin += "modulus = " + modulus;
		return fin;
	}
	
	public static BigInteger stringToBigInt(String str) {
		BigInteger fin = new BigInteger("99");

		for (int i = 0; i < str.length(); i++) {
			fin = fin.multiply(hundred);

			if (str.substring(i, i + 1).equals("a")) {
				fin = fin.add(new BigInteger("1"));
			} else if (str.substring(i, i + 1).equals("b")) {
				fin = fin.add(new BigInteger("2"));
			} else if (str.substring(i, i + 1).equals("c")) {
				fin = fin.add(new BigInteger("3"));
			} else if (str.substring(i, i + 1).equals("d")) {
				fin = fin.add(new BigInteger("4"));
			} else if (str.substring(i, i + 1).equals("e")) {
				fin = fin.add(new BigInteger("5"));
			} else if (str.substring(i, i + 1).equals("f")) {
				fin = fin.add(new BigInteger("6"));
			} else if (str.substring(i, i + 1).equals("g")) {
				fin = fin.add(new BigInteger("7"));
			} else if (str.substring(i, i + 1).equals("h")) {
				fin = fin.add(new BigInteger("8"));
			} else if (str.substring(i, i + 1).equals("i")) {
				fin = fin.add(new BigInteger("9"));
			} else if (str.substring(i, i + 1).equals("j")) {
				fin = fin.add(new BigInteger("10"));
			} else if (str.substring(i, i + 1).equals("k")) {
				fin = fin.add(new BigInteger("11"));
			} else if (str.substring(i, i + 1).equals("l")) {
				fin = fin.add(new BigInteger("12"));
			} else if (str.substring(i, i + 1).equals("m")) {
				fin = fin.add(new BigInteger("13"));
			} else if (str.substring(i, i + 1).equals("n")) {
				fin = fin.add(new BigInteger("14"));
			} else if (str.substring(i, i + 1).equals("o")) {
				fin = fin.add(new BigInteger("15"));
			} else if (str.substring(i, i + 1).equals("p")) {
				fin = fin.add(new BigInteger("16"));
			} else if (str.substring(i, i + 1).equals("q")) {
				fin = fin.add(new BigInteger("17"));
			} else if (str.substring(i, i + 1).equals("r")) {
				fin = fin.add(new BigInteger("18"));
			} else if (str.substring(i, i + 1).equals("s")) {
				fin = fin.add(new BigInteger("19"));
			} else if (str.substring(i, i + 1).equals("t")) {
				fin = fin.add(new BigInteger("20"));
			} else if (str.substring(i, i + 1).equals("u")) {
				fin = fin.add(new BigInteger("21"));
			} else if (str.substring(i, i + 1).equals("v")) {
				fin = fin.add(new BigInteger("22"));
			} else if (str.substring(i, i + 1).equals("w")) {
				fin = fin.add(new BigInteger("23"));
			} else if (str.substring(i, i + 1).equals("x")) {
				fin = fin.add(new BigInteger("24"));
			} else if (str.substring(i, i + 1).equals("y")) {
				fin = fin.add(new BigInteger("25"));
			} else if (str.substring(i, i + 1).equals("z")) {
				fin = fin.add(new BigInteger("26"));

			} else if (str.substring(i, i + 1).equals("A")) {
				fin = fin.add(new BigInteger("31"));
			} else if (str.substring(i, i + 1).equals("B")) {
				fin = fin.add(new BigInteger("32"));
			} else if (str.substring(i, i + 1).equals("C")) {
				fin = fin.add(new BigInteger("33"));
			} else if (str.substring(i, i + 1).equals("D")) {
				fin = fin.add(new BigInteger("34"));
			} else if (str.substring(i, i + 1).equals("E")) {
				fin = fin.add(new BigInteger("35"));
			} else if (str.substring(i, i + 1).equals("F")) {
				fin = fin.add(new BigInteger("36"));
			} else if (str.substring(i, i + 1).equals("G")) {
				fin = fin.add(new BigInteger("37"));
			} else if (str.substring(i, i + 1).equals("H")) {
				fin = fin.add(new BigInteger("38"));
			} else if (str.substring(i, i + 1).equals("I")) {
				fin = fin.add(new BigInteger("39"));
			} else if (str.substring(i, i + 1).equals("J")) {
				fin = fin.add(new BigInteger("40"));
			} else if (str.substring(i, i + 1).equals("K")) {
				fin = fin.add(new BigInteger("41"));
			} else if (str.substring(i, i + 1).equals("L")) {
				fin = fin.add(new BigInteger("42"));
			} else if (str.substring(i, i + 1).equals("M")) {
				fin = fin.add(new BigInteger("43"));
			} else if (str.substring(i, i + 1).equals("N")) {
				fin = fin.add(new BigInteger("44"));
			} else if (str.substring(i, i + 1).equals("O")) {
				fin = fin.add(new BigInteger("45"));
			} else if (str.substring(i, i + 1).equals("P")) {
				fin = fin.add(new BigInteger("46"));
			} else if (str.substring(i, i + 1).equals("Q")) {
				fin = fin.add(new BigInteger("47"));
			} else if (str.substring(i, i + 1).equals("R")) {
				fin = fin.add(new BigInteger("48"));
			} else if (str.substring(i, i + 1).equals("S")) {
				fin = fin.add(new BigInteger("49"));
			} else if (str.substring(i, i + 1).equals("T")) {
				fin = fin.add(new BigInteger("50"));
			} else if (str.substring(i, i + 1).equals("U")) {
				fin = fin.add(new BigInteger("51"));
			} else if (str.substring(i, i + 1).equals("V")) {
				fin = fin.add(new BigInteger("52"));
			} else if (str.substring(i, i + 1).equals("W")) {
				fin = fin.add(new BigInteger("53"));
			} else if (str.substring(i, i + 1).equals("X")) {
				fin = fin.add(new BigInteger("54"));
			} else if (str.substring(i, i + 1).equals("Y")) {
				fin = fin.add(new BigInteger("55"));
			} else if (str.substring(i, i + 1).equals("Z")) {
				fin = fin.add(new BigInteger("56"));

			} else if (str.substring(i, i + 1).equals("0")) {
				fin = fin.add(new BigInteger("60"));
			} else if (str.substring(i, i + 1).equals("1")) {
				fin = fin.add(new BigInteger("61"));
			} else if (str.substring(i, i + 1).equals("2")) {
				fin = fin.add(new BigInteger("62"));
			} else if (str.substring(i, i + 1).equals("3")) {
				fin = fin.add(new BigInteger("63"));
			} else if (str.substring(i, i + 1).equals("4")) {
				fin = fin.add(new BigInteger("64"));
			} else if (str.substring(i, i + 1).equals("5")) {
				fin = fin.add(new BigInteger("65"));
			} else if (str.substring(i, i + 1).equals("6")) {
				fin = fin.add(new BigInteger("66"));
			} else if (str.substring(i, i + 1).equals("7")) {
				fin = fin.add(new BigInteger("67"));
			} else if (str.substring(i, i + 1).equals("8")) {
				fin = fin.add(new BigInteger("68"));
			} else if (str.substring(i, i + 1).equals("9")) {
				fin = fin.add(new BigInteger("69"));

			} else if (str.substring(i, i + 1).equals(")")) {
				fin = fin.add(new BigInteger("70"));
			} else if (str.substring(i, i + 1).equals("!")) {
				fin = fin.add(new BigInteger("71"));
			} else if (str.substring(i, i + 1).equals("@")) {
				fin = fin.add(new BigInteger("72"));
			} else if (str.substring(i, i + 1).equals("#")) {
				fin = fin.add(new BigInteger("73"));
			} else if (str.substring(i, i + 1).equals("$")) {
				fin = fin.add(new BigInteger("74"));
			} else if (str.substring(i, i + 1).equals("%")) {
				fin = fin.add(new BigInteger("75"));
			} else if (str.substring(i, i + 1).equals("^")) {
				fin = fin.add(new BigInteger("76"));
			} else if (str.substring(i, i + 1).equals("&")) {
				fin = fin.add(new BigInteger("77"));
			} else if (str.substring(i, i + 1).equals("*")) {
				fin = fin.add(new BigInteger("78"));
			} else if (str.substring(i, i + 1).equals("(")) {
				fin = fin.add(new BigInteger("79"));

			} else if (str.substring(i, i + 1).equals(" ")) {
				fin = fin.add(new BigInteger("80"));
			} else if (str.substring(i, i + 1)./* equals */contains("\n")) {
				fin = fin.add(new BigInteger("81"));
			} else if (str.substring(i, i + 1)./* equals */contains("\t")) {
				fin = fin.add(new BigInteger("82"));
			} else if (str.substring(i, i + 1).equals("-")) {
				fin = fin.add(new BigInteger("83"));
			} else if (str.substring(i, i + 1).equals("_")) {
				fin = fin.add(new BigInteger("84"));
			} else if (str.substring(i, i + 1).equals("+")) {
				fin = fin.add(new BigInteger("85"));
			} else if (str.substring(i, i + 1).equals("=")) {
				fin = fin.add(new BigInteger("86"));
			} else if (str.substring(i, i + 1).equals(".")) {
				fin = fin.add(new BigInteger("87"));
			} else if (str.substring(i, i + 1).equals(",")) {
				fin = fin.add(new BigInteger("88"));
			} else if (str.substring(i, i + 1).equals("?")) {
				fin = fin.add(new BigInteger("89"));
			} else if (str.substring(i, i + 1).equals("/")) {
				fin = fin.add(new BigInteger("90"));
			} else if (str.substring(i, i + 1).equals("|")) {
				fin = fin.add(new BigInteger("91"));
			} else if (str.substring(i, i + 1).equals("\\")) {
				fin = fin.add(new BigInteger("92"));
			} else if (str.substring(i, i + 1).equals("{")) {
				fin = fin.add(new BigInteger("93"));
			} else if (str.substring(i, i + 1).equals("}")) {
				fin = fin.add(new BigInteger("94"));
			} else if (str.substring(i, i + 1).equals("[")) {
				fin = fin.add(new BigInteger("95"));
			} else if (str.substring(i, i + 1).equals("]")) {
				fin = fin.add(new BigInteger("96"));
			} else if (str.substring(i, i + 1).equals("~")) {
				fin = fin.add(new BigInteger("97"));
			} else if (str.substring(i, i + 1).equals("`")) {
				fin = fin.add(new BigInteger("98"));

			} else if (str.substring(i, i + 1).equals(":")) {
				fin = fin.add(new BigInteger("27"));
			} else if (str.substring(i, i + 1).equals(";")) {
				fin = fin.add(new BigInteger("28"));
			} else if (str.substring(i, i + 1).equals("\'")) {
				fin = fin.add(new BigInteger("29"));
			} else if (str.substring(i, i + 1).equals("\"")) {
				fin = fin.add(new BigInteger("30"));

			} else if (str.substring(i, i + 1).equals("<")) {
				fin = fin.add(new BigInteger("57"));
			} else if (str.substring(i, i + 1).equals(">")) {
				fin = fin.add(new BigInteger("58"));
			} else if (str.substring(i, i + 1).equals("BLANK")) {
				fin = fin.add(new BigInteger("59"));
			} else {
				fin = fin.divide(hundred);
			}
		}
		fin = fin.multiply(hundred);
		fin = fin.add(new BigInteger("00"));
		return fin;
	}

	public static String bigIntToString(BigInteger bigInt) {
		String fin = "";
		BigInteger big = bigInt;

		BigInteger firstValue = big;
		int lastValue = big.mod(hundred).intValue();

		while (firstValue.intValue() > 100 || firstValue.intValue() < 0)
			firstValue = firstValue.divide(hundred);

		if (firstValue.intValue() != 99 || lastValue != 00) {
			System.out.println("ERROR: Unrecognized encrypted string");
			System.exit(0);
		}

		big = big.divide(hundred);
		while (big.intValue() != 99) {
			if (big.mod(hundred).intValue() == 1) {
				fin = "a" + fin;
			} else if (big.mod(hundred).intValue() == 2) {
				fin = "b" + fin;
			} else if (big.mod(hundred).intValue() == 3) {
				fin = "c" + fin;
			} else if (big.mod(hundred).intValue() == 4) {
				fin = "d" + fin;
			} else if (big.mod(hundred).intValue() == 5) {
				fin = "e" + fin;
			} else if (big.mod(hundred).intValue() == 6) {
				fin = "f" + fin;
			} else if (big.mod(hundred).intValue() == 7) {
				fin = "g" + fin;
			} else if (big.mod(hundred).intValue() == 8) {
				fin = "h" + fin;
			} else if (big.mod(hundred).intValue() == 9) {
				fin = "i" + fin;
			} else if (big.mod(hundred).intValue() == 10) {
				fin = "j" + fin;
			} else if (big.mod(hundred).intValue() == 11) {
				fin = "k" + fin;
			} else if (big.mod(hundred).intValue() == 12) {
				fin = "l" + fin;
			} else if (big.mod(hundred).intValue() == 13) {
				fin = "m" + fin;
			} else if (big.mod(hundred).intValue() == 14) {
				fin = "n" + fin;
			} else if (big.mod(hundred).intValue() == 15) {
				fin = "o" + fin;
			} else if (big.mod(hundred).intValue() == 16) {
				fin = "p" + fin;
			} else if (big.mod(hundred).intValue() == 17) {
				fin = "q" + fin;
			} else if (big.mod(hundred).intValue() == 18) {
				fin = "r" + fin;
			} else if (big.mod(hundred).intValue() == 19) {
				fin = "s" + fin;
			} else if (big.mod(hundred).intValue() == 20) {
				fin = "t" + fin;
			} else if (big.mod(hundred).intValue() == 21) {
				fin = "u" + fin;
			} else if (big.mod(hundred).intValue() == 22) {
				fin = "v" + fin;
			} else if (big.mod(hundred).intValue() == 23) {
				fin = "w" + fin;
			} else if (big.mod(hundred).intValue() == 24) {
				fin = "x" + fin;
			} else if (big.mod(hundred).intValue() == 25) {
				fin = "y" + fin;
			} else if (big.mod(hundred).intValue() == 26) {
				fin = "z" + fin;

			} else if (big.mod(hundred).intValue() == 31) {
				fin = "A" + fin;
			} else if (big.mod(hundred).intValue() == 32) {
				fin = "B" + fin;
			} else if (big.mod(hundred).intValue() == 33) {
				fin = "C" + fin;
			} else if (big.mod(hundred).intValue() == 34) {
				fin = "D" + fin;
			} else if (big.mod(hundred).intValue() == 35) {
				fin = "E" + fin;
			} else if (big.mod(hundred).intValue() == 36) {
				fin = "F" + fin;
			} else if (big.mod(hundred).intValue() == 37) {
				fin = "G" + fin;
			} else if (big.mod(hundred).intValue() == 38) {
				fin = "H" + fin;
			} else if (big.mod(hundred).intValue() == 39) {
				fin = "I" + fin;
			} else if (big.mod(hundred).intValue() == 40) {
				fin = "J" + fin;
			} else if (big.mod(hundred).intValue() == 41) {
				fin = "K" + fin;
			} else if (big.mod(hundred).intValue() == 42) {
				fin = "L" + fin;
			} else if (big.mod(hundred).intValue() == 43) {
				fin = "M" + fin;
			} else if (big.mod(hundred).intValue() == 44) {
				fin = "N" + fin;
			} else if (big.mod(hundred).intValue() == 45) {
				fin = "O" + fin;
			} else if (big.mod(hundred).intValue() == 46) {
				fin = "P" + fin;
			} else if (big.mod(hundred).intValue() == 47) {
				fin = "Q" + fin;
			} else if (big.mod(hundred).intValue() == 48) {
				fin = "R" + fin;
			} else if (big.mod(hundred).intValue() == 49) {
				fin = "S" + fin;
			} else if (big.mod(hundred).intValue() == 50) {
				fin = "T" + fin;
			} else if (big.mod(hundred).intValue() == 51) {
				fin = "U" + fin;
			} else if (big.mod(hundred).intValue() == 52) {
				fin = "V" + fin;
			} else if (big.mod(hundred).intValue() == 53) {
				fin = "W" + fin;
			} else if (big.mod(hundred).intValue() == 54) {
				fin = "X" + fin;
			} else if (big.mod(hundred).intValue() == 55) {
				fin = "Y" + fin;
			} else if (big.mod(hundred).intValue() == 56) {
				fin = "Z" + fin;

			} else if (big.mod(hundred).intValue() == 60) {
				fin = "0" + fin;
			} else if (big.mod(hundred).intValue() == 61) {
				fin = "1" + fin;
			} else if (big.mod(hundred).intValue() == 62) {
				fin = "2" + fin;
			} else if (big.mod(hundred).intValue() == 63) {
				fin = "3" + fin;
			} else if (big.mod(hundred).intValue() == 64) {
				fin = "4" + fin;
			} else if (big.mod(hundred).intValue() == 65) {
				fin = "5" + fin;
			} else if (big.mod(hundred).intValue() == 66) {
				fin = "6" + fin;
			} else if (big.mod(hundred).intValue() == 67) {
				fin = "7" + fin;
			} else if (big.mod(hundred).intValue() == 68) {
				fin = "8" + fin;
			} else if (big.mod(hundred).intValue() == 69) {
				fin = "9" + fin;

			} else if (big.mod(hundred).intValue() == 70) {
				fin = ")" + fin;
			} else if (big.mod(hundred).intValue() == 71) {
				fin = "!" + fin;
			} else if (big.mod(hundred).intValue() == 72) {
				fin = "@" + fin;
			} else if (big.mod(hundred).intValue() == 73) {
				fin = "#" + fin;
			} else if (big.mod(hundred).intValue() == 74) {
				fin = "$" + fin;
			} else if (big.mod(hundred).intValue() == 75) {
				fin = "%" + fin;
			} else if (big.mod(hundred).intValue() == 76) {
				fin = "^" + fin;
			} else if (big.mod(hundred).intValue() == 77) {
				fin = "&" + fin;
			} else if (big.mod(hundred).intValue() == 78) {
				fin = "*" + fin;
			} else if (big.mod(hundred).intValue() == 79) {
				fin = "(" + fin;

			} else if (big.mod(hundred).intValue() == 80) {
				fin = " " + fin;
			} else if (big.mod(hundred).intValue() == 81) {
				fin = "\n" + fin;
			} else if (big.mod(hundred).intValue() == 82) {
				fin = "\t" + fin;
			} else if (big.mod(hundred).intValue() == 83) {
				fin = "-" + fin;
			} else if (big.mod(hundred).intValue() == 84) {
				fin = "_" + fin;
			} else if (big.mod(hundred).intValue() == 85) {
				fin = "+" + fin;
			} else if (big.mod(hundred).intValue() == 86) {
				fin = "=" + fin;
			} else if (big.mod(hundred).intValue() == 87) {
				fin = "." + fin;
			} else if (big.mod(hundred).intValue() == 88) {
				fin = "," + fin;
			} else if (big.mod(hundred).intValue() == 89) {
				fin = "?" + fin;
			} else if (big.mod(hundred).intValue() == 90) {
				fin = "/" + fin;
			} else if (big.mod(hundred).intValue() == 91) {
				fin = "|" + fin;
			} else if (big.mod(hundred).intValue() == 92) {
				fin = "\\" + fin;
			} else if (big.mod(hundred).intValue() == 93) {
				fin = "{" + fin;
			} else if (big.mod(hundred).intValue() == 94) {
				fin = "}" + fin;
			} else if (big.mod(hundred).intValue() == 95) {
				fin = "[" + fin;
			} else if (big.mod(hundred).intValue() == 96) {
				fin = "]" + fin;
			} else if (big.mod(hundred).intValue() == 97) {
				fin = "~" + fin;
			} else if (big.mod(hundred).intValue() == 98) {
				fin = "`" + fin;
			} else if (big.mod(hundred).intValue() == 27) {
				fin = ":" + fin;
			} else if (big.mod(hundred).intValue() == 28) {
				fin = ";" + fin;
			} else if (big.mod(hundred).intValue() == 29) {
				fin = "\'" + fin;
			} else if (big.mod(hundred).intValue() == 30) {
				fin = "\"" + fin;
			} else if (big.mod(hundred).intValue() == 57) {
				fin = "<" + fin;
			} else if (big.mod(hundred).intValue() == 58) {
				fin = ">" + fin;
			} else if (big.mod(hundred).intValue() == 59) {
				fin = "BLANK" + fin;
			} else {
				System.out.println("Bad encrypted string");
			}

			big = big.divide(hundred);
		}
		return fin;
	}
}
