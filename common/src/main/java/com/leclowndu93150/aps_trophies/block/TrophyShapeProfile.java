package com.leclowndu93150.aps_trophies.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public enum TrophyShapeProfile {
    BALL(
            shape(
                    box(6.0, 0.0, 6.0, 10.0, 4.5, 10.0),
                    box(6.5, 4.5, 6.5, 9.5, 8.0, 9.5),
                    box(5.5, 8.0, 5.5, 10.5, 14.0, 10.5)
            )
    ),
    SINGLE_STATUE(
            shape(
                    box(5.0, 0.0, 5.0, 11.0, 3.0, 11.0),
                    box(4.0, 3.0, 4.0, 12.0, 7.0, 12.0),
                    box(2.5, 7.0, 2.5, 13.5, 16.0, 13.5)
            )
    ),
    RACE(
            shape(
                    box(4.5, 0.0, 4.5, 11.5, 9.0, 11.5),
                    box(5.5, 9.0, 5.5, 10.5, 16.0, 10.5)
            ),
            shape(
                    box(5.0, 0.0, 5.0, 11.0, 11.5, 11.0),
                    box(3.0, 11.5, 2.0, 13.0, 16.0, 14.0)
            )
    );

    private final VoxelShape[] lowerShapes;
    private final VoxelShape[] upperShapes;

    TrophyShapeProfile(VoxelShape shape) {
        this(shape, shape);
    }

    TrophyShapeProfile(VoxelShape lowerShape, VoxelShape upperShape) {
        this.lowerShapes = rotateAll(lowerShape);
        this.upperShapes = rotateAll(upperShape);
    }

    public VoxelShape lower(Direction facing) {
        return this.lowerShapes[index(facing)];
    }

    public VoxelShape upper(Direction facing) {
        return this.upperShapes[index(facing)];
    }

    private static int index(Direction facing) {
        return switch (facing) {
            case EAST -> 1;
            case SOUTH -> 2;
            case WEST -> 3;
            default -> 0;
        };
    }

    private static VoxelShape[] rotateAll(VoxelShape northShape) {
        return new VoxelShape[]{
                northShape,
                rotate(northShape, 1),
                rotate(northShape, 2),
                rotate(northShape, 3)
        };
    }

    private static VoxelShape rotate(VoxelShape shape, int quarterTurns) {
        VoxelShape rotated = Shapes.empty();
        for (AABB box : shape.toAabbs()) {
            double minX = box.minX;
            double minZ = box.minZ;
            double maxX = box.maxX;
            double maxZ = box.maxZ;

            for (int turn = 0; turn < quarterTurns; turn++) {
                double nextMinX = 1.0 - maxZ;
                double nextMaxX = 1.0 - minZ;
                double nextMinZ = minX;
                double nextMaxZ = maxX;
                minX = nextMinX;
                maxX = nextMaxX;
                minZ = nextMinZ;
                maxZ = nextMaxZ;
            }

            rotated = Shapes.or(rotated, Shapes.create(minX, box.minY, minZ, maxX, box.maxY, maxZ));
        }
        return rotated.optimize();
    }

    private static VoxelShape shape(VoxelShape... boxes) {
        VoxelShape shape = Shapes.empty();
        for (VoxelShape box : boxes) {
            shape = Shapes.or(shape, box);
        }
        return shape.optimize();
    }

    private static VoxelShape box(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        return Block.box(minX, minY, minZ, maxX, maxY, maxZ);
    }
}
