/// Import STLs from source

CSG base  = Vitamins.get(ScriptingEngine.fileFromGit(
				"https://github.com/JansenSmith/CastleDiceTower.git",
				"Another_dice_tower/files/Base.stl"))
				.setColor(javafx.scene.paint.Color.GRAY)

return base