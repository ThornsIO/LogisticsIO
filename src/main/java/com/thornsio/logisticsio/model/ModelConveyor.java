package com.thornsio.logisticsio.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelConveyor extends ModelBase
{
    //fields
    ModelRenderer Roller1;
    ModelRenderer Roller2;
    ModelRenderer Roller3;
    ModelRenderer BeltTop;
    ModelRenderer BeltBottom;

    public ModelConveyor()
    {
        textureWidth = 64;
        textureHeight = 32;

        Roller1 = new ModelRenderer(this, 0, 8);
        Roller1.addBox(0F, 0F, 0F, 16, 2, 2);
        Roller1.setRotationPoint(-8F, 21F, 5F);
        Roller1.setTextureSize(64, 32);
        Roller1.mirror = true;
        setRotation(Roller1, 0F, 0F, 0F);
        Roller2 = new ModelRenderer(this, 0, 8);
        Roller2.addBox(0F, 0F, 0F, 16, 2, 2);
        Roller2.setRotationPoint(-8F, 21F, -1F);
        Roller2.setTextureSize(64, 32);
        Roller2.mirror = true;
        setRotation(Roller2, 0F, 0F, 0F);
        Roller3 = new ModelRenderer(this, 0, 8);
        Roller3.addBox(0F, 0F, 0F, 16, 2, 2);
        Roller3.setRotationPoint(-8F, 21F, -7F);
        Roller3.setTextureSize(64, 32);
        Roller3.mirror = true;
        setRotation(Roller3, 0F, 0F, 0F);
        BeltTop = new ModelRenderer(this, 0, 15);
        BeltTop.addBox(0F, 0F, 0F, 16, 1, 16);
        BeltTop.setRotationPoint(-8F, 20F, -8F);
        BeltTop.setTextureSize(64, 32);
        BeltTop.mirror = true;
        setRotation(BeltTop, 0F, 0F, 0F);
        BeltBottom = new ModelRenderer(this, 0, 15);
        BeltBottom.addBox(0F, 0F, 0F, 16, 1, 16);
        BeltBottom.setRotationPoint(-8F, 23F, -8F);
        BeltBottom.setTextureSize(64, 32);
        BeltBottom.mirror = true;
        setRotation(BeltBottom, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Roller1.render(f5);
        Roller2.render(f5);
        Roller3.render(f5);
        BeltTop.render(f5);
        BeltBottom.render(f5);
    }

    public void renderModel(float f)
    {
        Roller1.render(f);
        Roller2.render(f);
        Roller3.render(f);
        BeltTop.render(f);
        BeltBottom.render(f);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
