package cfg.bonus;
public final class DailyBonus extends cfg.CfgObject {
	public final static int TYPEID = 2147210015;
	final public int getTypeId() { return TYPEID; }
	public final int time;
	public final cfg.cmd.action.MultiBonus bonus;
	public DailyBonus(cfg.DataStream fs) {
		this.time = fs.getInt();
		this.bonus = new cfg.cmd.action.MultiBonus(fs);
	}
}