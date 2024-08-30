package discussion.inheritance;

public class Weapons {

	void useWeapon() {
		System.out.println("Weapon used");
	}
}

class Grenade extends Weapons {
	@Override
	void useWeapon() {
		System.out.println("Grenade used. Boom!");
	}
}

class Ak47 extends Weapons {
	@Override
	void useWeapon() {
		System.out.println("Ak47 is used. Rat a tat tat tat tat!");
	}
}

class Sniper extends Weapons {
	@Override
	void useWeapon() {
		System.out.println("Sniper used. Headshot!");
	}
}

class RocketLauncher extends Weapons {
	@Override
	void useWeapon() {
		System.out.println("Rocket Launcher used. Kaboom!");
	}
}

