package com.zy.rank.core.base;

public class RankException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RankException(String args) {
		super("RankException:" + args);
	}

	public RankException() {
		super("RankService 内部错误");
	}
}
