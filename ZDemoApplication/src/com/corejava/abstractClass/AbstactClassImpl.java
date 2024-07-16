package com.corejava.abstractClass;

public class AbstactClassImpl extends AbstractImpl {

	public static void main(String[] args) {
		AbstactClassImpl abs = new AbstactClassImpl();
		System.out.println(abs.isAbstract());
		System.out.println(abs.isShown());
	}

	@Override
	public Boolean isShown() {
		return Boolean.TRUE;
	}

}
