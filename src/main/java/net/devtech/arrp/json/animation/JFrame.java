package net.devtech.arrp.json.animation;

public class JFrame implements Cloneable {
	private final int index;
	private Integer time;

	@Override
	public JFrame clone() {
		try {
			return (JFrame) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}

	JFrame(int index) {this.index = index;}
}
