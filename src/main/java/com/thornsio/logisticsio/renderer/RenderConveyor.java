package com.thornsio.logisticsio.renderer;

import com.thornsio.logisticsio.model.ModelConveyor;
import com.thornsio.logisticsio.reference.Reference;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by ThornsIO on 31/07/2015.
 */
public class RenderConveyor extends TileEntitySpecialRenderer
{

    private static final ResourceLocation texture = new ResourceLocation(Reference.LOWERCASE_MOD_ID + ":" + "assets/textures/model/conveyor.png");

    private ModelConveyor model;

    public RenderConveyor() {
        this.model = new ModelConveyor();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5f, (float)y + 1.5f, (float)z + 0.5f);
        GL11.glRotatef(180, 0f, 0f, 1f);

        this.bindTexture(texture);

        GL11.glPushMatrix();
        this.model.renderModel(0.0625f);
        GL11.glPopMatrix();

        GL11.glPopMatrix();

    }
}
