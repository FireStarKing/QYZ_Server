
package lx.gs.equip.normalequip;

import com.goldhuman.Common.Marshal.OctetsStream;
import com.goldhuman.Common.Marshal.MarshalException;

// {{{ RPCGEN_IMPORT_BEGIN
// {{{ DO NOT EDIT THIS

abstract class __CSwapEquipProp__ extends xio.Protocol { }

// DO NOT EDIT THIS }}}
// RPCGEN_IMPORT_END }}}

public class CSwapEquipProp extends __CSwapEquipProp__ {
	@Override
	protected void process() {
		// protocol handle
	}

	// {{{ RPCGEN_DEFINE_BEGIN
	// {{{ DO NOT EDIT THIS
	public static final int PROTOCOL_TYPE = 6555432;

	public int getType() {
		return 6555432;
	}

	public int bagtype1;
	public int pos1; // 装备1id
	public int bagtype2;
	public int pos2; // 装备2id
	public int isswapanneal; // 是否交换炼器等级
	public int isswapperfuse; // 是否交换追加等级

	public CSwapEquipProp() {
	}

	public CSwapEquipProp(int _bagtype1_, int _pos1_, int _bagtype2_, int _pos2_, int _isswapanneal_, int _isswapperfuse_) {
		this.bagtype1 = _bagtype1_;
		this.pos1 = _pos1_;
		this.bagtype2 = _bagtype2_;
		this.pos2 = _pos2_;
		this.isswapanneal = _isswapanneal_;
		this.isswapperfuse = _isswapperfuse_;
	}

	public final boolean _validator_() {
		return true;
	}

	public OctetsStream marshal(OctetsStream _os_) {
		_os_.marshal(bagtype1);
		_os_.marshal(pos1);
		_os_.marshal(bagtype2);
		_os_.marshal(pos2);
		_os_.marshal(isswapanneal);
		_os_.marshal(isswapperfuse);
		return _os_;
	}

	public OctetsStream unmarshal(OctetsStream _os_) throws MarshalException {
		bagtype1 = _os_.unmarshal_int();
		pos1 = _os_.unmarshal_int();
		bagtype2 = _os_.unmarshal_int();
		pos2 = _os_.unmarshal_int();
		isswapanneal = _os_.unmarshal_int();
		isswapperfuse = _os_.unmarshal_int();
		return _os_;
	}

	public boolean equals(Object _o1_) {
		if (_o1_ == this) return true;
		if (_o1_ instanceof CSwapEquipProp) {
			CSwapEquipProp _o_ = (CSwapEquipProp)_o1_;
			if (bagtype1 != _o_.bagtype1) return false;
			if (pos1 != _o_.pos1) return false;
			if (bagtype2 != _o_.bagtype2) return false;
			if (pos2 != _o_.pos2) return false;
			if (isswapanneal != _o_.isswapanneal) return false;
			if (isswapperfuse != _o_.isswapperfuse) return false;
			return true;
		}
		return false;
	}

	public int hashCode() {
		int _h_ = 0;
		_h_ += bagtype1;
		_h_ += pos1;
		_h_ += bagtype2;
		_h_ += pos2;
		_h_ += isswapanneal;
		_h_ += isswapperfuse;
		return _h_;
	}

	public String toString() {
		StringBuilder _sb_ = new StringBuilder();
		_sb_.append("(");
		_sb_.append(bagtype1).append(",");
		_sb_.append(pos1).append(",");
		_sb_.append(bagtype2).append(",");
		_sb_.append(pos2).append(",");
		_sb_.append(isswapanneal).append(",");
		_sb_.append(isswapperfuse).append(",");
		_sb_.append(")");
		return _sb_.toString();
	}

	public int compareTo(CSwapEquipProp _o_) {
		if (_o_ == this) return 0;
		int _c_ = 0;
		_c_ = bagtype1 - _o_.bagtype1;
		if (0 != _c_) return _c_;
		_c_ = pos1 - _o_.pos1;
		if (0 != _c_) return _c_;
		_c_ = bagtype2 - _o_.bagtype2;
		if (0 != _c_) return _c_;
		_c_ = pos2 - _o_.pos2;
		if (0 != _c_) return _c_;
		_c_ = isswapanneal - _o_.isswapanneal;
		if (0 != _c_) return _c_;
		_c_ = isswapperfuse - _o_.isswapperfuse;
		if (0 != _c_) return _c_;
		return _c_;
	}

	// DO NOT EDIT THIS }}}
	// RPCGEN_DEFINE_END }}}

}

