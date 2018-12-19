package TESTO;

import java.io.*;
import java.util.*;

public class TEST0 {

	public static void main(String[] args) {
		String[] a = { "A", "B", "C", "D", "E" };
		for (int i = 1; i <= a.length; i++) {
			System.out.println(a.length + "选" + i);
			String[] res = new String[i];
			combine(a, 0, res, 0);
		}
	}

	final static public void combine(final Object a[], final int a_pos, final Object rs[], final int rs_pos) {
		if (rs_pos == rs.length) {
			for (int i = 0; i < rs.length; i++)
				System.out.print(rs[i] + " ");
			System.out.println();
		} else
			for (int ap = a_pos; ap < a.length; ap++) {
				rs[rs_pos] = a[ap];
				combine(a, ap + 1, rs, rs_pos + 1);
			}
	}
}
