package practice_9th_week.problem01;

public class PC {
	private String pcname;
	private String board;
	private String cpu;
	private String ram;
	private String ssd;
	private String hdd;
	private String gfx;
	
	public PC(String pcname, String board, String cpu, String ram, String ssd, String hdd, String gfx) {
		this.pcname = pcname;
		this.board = board;
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		this.hdd = hdd;
		this.gfx = gfx;
	}
	public PC(String pcname, String board, String cpu, String ram, String ssd, String hdd) {
		this.pcname = pcname;
		this.board = board;
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		this.hdd = hdd;
		this.gfx = "none";
	}
	public PC(String pcname, String board, String cpu, String ram, String ssd) {
		this.pcname = pcname;
		this.board = board;
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		this.hdd = "none";
		this.gfx = "none";
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("================================\n");
		sb.append("PC name : " + pcname + "\n");
		sb.append("mother board : " + board + "\n");
		sb.append("cpu : " + cpu + "\n");
		sb.append("ram : " + ram + "\n");
		sb.append("ssd : " + ssd + "\n");
		sb.append("hdd : " + hdd + "\n");
		sb.append("graphic card : " + gfx + "\n");
		sb.append("================================");
		return sb.toString();
	}
}
