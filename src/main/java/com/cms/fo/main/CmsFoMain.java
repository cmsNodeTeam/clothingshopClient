package com.cms.fo.main;

import java.util.ArrayList;
import java.util.List;

public class CmsFoMain {

	public static void main(String[] args) {
		List<String> objs = new ArrayList<>();
		objs.add("aa");
		objs.add("bb");
		objs.forEach(s -> {
			System.out.println(s);
		});
	}
}
