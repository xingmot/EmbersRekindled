package teamroots.embers.util;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class BlockTextureUtil {
	public static Map<ResourceLocation, TextureAtlasSprite> textures = Maps.newHashMap();
	
	public static void mapBlockTexture(TextureMap map, ResourceLocation texture){
		TextureAtlasSprite sprite = map.registerSprite(texture);
        textures.put(texture,sprite);
	}
}
