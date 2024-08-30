package discussion.inheritance;

public class AttackPakistan {
	public static void main(String[] args) {
		Grenade g = new Grenade();
		g.useWeapon();
		Ak47 a = new Ak47();
		a.useWeapon();
		Sniper s = new Sniper();
		s.useWeapon();
		RocketLauncher r = new RocketLauncher();
		r.useWeapon();
	}
}