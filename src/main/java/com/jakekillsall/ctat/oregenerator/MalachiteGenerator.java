package com.jakekillsall.ctat.oregenerator;

import com.jakekillsall.ctat.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class MalachiteGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 32; k++){
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockYCoord = rand.nextInt(70);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModBlocks.malachiteOre, 5, Blocks.end_stone)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }}

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
        for(int k = 0; k < 10; k++){
            int firstBlockXCoord = chunkX + rand.nextInt(16);
            int firstBlockYCoord = rand.nextInt(30);
            int firstBlockZCoord = chunkZ + rand.nextInt(16);

            (new WorldGenMinable(ModBlocks.malachiteOre, 5)).generate(world, rand, firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
        }
    }

    private void generateNether(World world, Random rand, int chunkX, int chunkZ) {}
}
