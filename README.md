# Additional Saturation

Adds Overflow Hunger to Minecraft!

## Description

Not a very large mod, all it does is give you extra room for saturation so you don't have to be at 9 hunger points and then eat an entire steak, just for it to only give you 1 other hunger point while 3/4 gets wasted without anything you can do about it. This mod works for every vanilla food item, except cake.

## Compatibility

This is a Server-Side Mod which means if you have a server, you have to install the mod on the server in order for it to work. (Although I'm not yet sure if it works with multiplayer) This mod runs on Minecraft Version 1.20.1. No, I am not going to update it until the [dependency](https://modrinth.com/mod/mealapi) gets an update. Also, this mod runs on [fabric.](https://fabricmc.net)

## Dependencies

Since being on the Fabric loader it requires the [Fabric API](https://modrinth.com/mod/fabric-api) as well as requiring the [Meal API.](https://modrinth.com/mod/meal-api)

## Download

You can download it on [Github](https://github.com/HotdoGuy90/AdditionalSaturation) or [Modrinth](https://modrinth.com/mod/additional-saturation)

## For Developers

If you have a mod or you installed a mod and want to make it compatible with this mod, all you need to do is add the following file and directory to your mod/datapack:

For Mods: `YOUR_MOD_FOLDER/src/main/resources/data/additional_saturation/tags/items/detected_edible_food_items.json`

For Datapacks: `YOUR_DATAPACK_FOLDER/data/additional_saturation/tags/items/detected_edible_food_items.json`

**NOTE: THE FOLDER THAT SAYS `additional_saturation` IS NOT A TYPO. IT MUST BE THERE IN ORDER FOR THE MOD TO ACTUALLY DETECT THE FILE. DO NOT REPLACE IT WITH YOUR OWN MOD ID!!**

Then in `detected_edible_food_items.json` add:

```json
{
    "replace": false,
    "values": [
        "your-mod-id:your_item",
        "your-mod-id:your_other_item"
    ]
}
```

But replace `"your-mod-id:your_item"` and `"you-mod-id:your_other_item"` with the identifiers of actual food items.
