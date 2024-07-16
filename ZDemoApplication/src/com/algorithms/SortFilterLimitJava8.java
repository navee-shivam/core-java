package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class SortFilterLimitJava8 {

	public static void main(String[] args) {
		List<Mobile> listMobileObject = new ArrayList<>();
		listMobileObject.add(new Mobile(1, "Nokia", 4, "Window8", "Renu"));
		listMobileObject.add(new Mobile(2, "Microsoft", 2, "Window10", "Krishna"));
		listMobileObject.add(new Mobile(9, "OnePlus", 6, "Android10", "Surendhar"));
		listMobileObject.add(new Mobile(3, "Samsung", 2, "Android8", "Moni"));
		listMobileObject.add(new Mobile(8, "Iphone", 6, "Ios12", "Vyshu"));
		listMobileObject.add(new Mobile(7, "Oppo", 4, "Android9", "Mathi"));
		listMobileObject.add(new Mobile(4, "Moto", 8, "Android9", "Saran"));
		listMobileObject.add(new Mobile(6, "OnePlus", 12, "Android10", "Navee"));
		listMobileObject.add(new Mobile(15, "Samsung", 8, "Android10", "Kumar"));
		listMobileObject.add(new Mobile(11, "Sony", 6, "Android9", "Ramya"));
		funcInterface mk = MakeOperation::new;
		mk.makeOperation(listMobileObject);
	}
}

class Mobile {
	private int id;
	private String name;
	private int ram;
	private String platform;
	private String OName;

	public Mobile(int id, String name, int ram, String platform, String oName) {
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.platform = platform;
		OName = oName;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRam() {
		return ram;
	}

	public String getPlatform() {
		return platform;
	}

	public String getOName() {
		return OName;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram
				+ ", platform=" + platform + ", OName=" + OName + "]";
	}
}

interface funcInterface {
	MakeOperation makeOperation(List<Mobile> listMobileObject);
}

class MakeOperation {

	private void doSortedFilterLimit(List<Mobile> listMobileObject) {
		listMobileObject.stream()
//				.sorted((m1, m2) -> m1.getId() > m2.getId() ? 1 : -1)
				.sorted((o1, o2) -> o1.getOName().compareTo(o2.getOName()))
				.skip(4)
				.forEach(System.out::println);
	}

	public MakeOperation(List<Mobile> listMobileObject) {
		this.doSortedFilterLimit(listMobileObject);
	}
}
