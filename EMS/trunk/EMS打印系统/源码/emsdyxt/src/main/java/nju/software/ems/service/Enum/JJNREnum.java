package nju.software.ems.service.Enum;

public enum JJNREnum {
	slajtzs("slajtzs" , 2 , "������֪ͨ��"),
	cttzs("cttzs" , 3 , "��֪ͥͨ��"),
	ystzs("ystzs" , 5 , "Ӧ��֪ͨ��"),
	mscds("mscds" , 7 , "���²ö���"),
	qshfszfb("qshfszfb" , 11 , "���߻���״����"),
	mscjs("mscjs",13 , "�����о���"),
	dbzfb("dbzfb" , 17 , "���״����"),
	mstjs("mstjs" , 19 , "���µ�����" ),
	jztzs("jztzs" , 23 , "��֤֪ͨ��"),
	cp("cp" , 29 , "��Ʊ"),
	qt("qt" ,31 ,"����");
	
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
