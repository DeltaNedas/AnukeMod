package anuke;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class AnukeMod extends Mod {
	public AnukeMod() {
		Log.info("Loaded AnukeMod constructor.");

		//listen for game load event
		Events.on(ClientLoadEvent.class, e -> {
			//show dialog upon startup
			Time.runTask(10f, () -> {
				BaseDialog dialog = new BaseDialog("rabbit");
				dialog.cont.add("worship").row();
				//mod sprites are prefixed with the mod name (this mod is called 'anuke-mod' in its config)
				dialog.cont.image(Core.atlas.find("god")).pad(20f).row();
				dialog.cont.button("ok", dialog::hide).size(200f, 500f);
				dialog.cont.button("no", Core.app::exit).size(20f, 5f);
				dialog.show();
			});
		});
	}

	@Override
	public void loadContent() {
		Log.info("Loading some example content.");
	}
}
