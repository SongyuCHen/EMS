package nju.software.ems.service.Enum;

public enum JJNREnum {
	slajtzs("slajtzs" , 2 , "受理案件通知书"),
	cttzs("cttzs" , 3 , "出庭通知书"),
	ystzs("ystzs" , 5 , "应诉通知书"),
	mscds("mscds" , 7 , "民事裁定书"),
	qshfszfb("qshfszfb" , 11 , "起诉或发诉状副本"),
	mscjs("mscjs",13 , "民事判决书"),
	dbzfb("dbzfb" , 17 , "答辩状副本"),
	mstjs("mstjs" , 19 , "民事调解书" ),
	jztzs("jztzs" , 23 , "举证通知书"),
	cp("cp" , 29 , "传票"),
	qt("qt" ,31 ,"其他");
	
	String name;
	Integer val;
	String nr;
	
	private JJNREnum(String name , Integer val , String nr)
	{
		this.name = name;
		this.val = val;
		this.nr = nr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}
}
