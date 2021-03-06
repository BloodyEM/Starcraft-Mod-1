package com.hypeirochus.scmc.client.renderer.model;

import com.hypeirochus.api.client.render.model.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * predatorSC2 - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelPredator extends Model {
	public ModelRenderer	chest;
	public ModelRenderer	head01;
	public ModelRenderer	torso;
	public ModelRenderer	lDorsalPlate1;
	public ModelRenderer	rDorsalPlate1;
	public ModelRenderer	mDorsalPlate;
	public ModelRenderer	neck;
	public ModelRenderer	lArm1;
	public ModelRenderer	rArm1;
	public ModelRenderer	rear;
	public ModelRenderer	tail1;
	public ModelRenderer	lThighJoint;
	public ModelRenderer	rThighJoint;
	public ModelRenderer	tail2;
	public ModelRenderer	tail3;
	public ModelRenderer	tail4;
	public ModelRenderer	tail5;
	public ModelRenderer	tail6;
	public ModelRenderer	tail7;
	public ModelRenderer	tail8a;
	public ModelRenderer	tail9;
	public ModelRenderer	tail8b;
	public ModelRenderer	tail8c;
	public ModelRenderer	tail8d;
	public ModelRenderer	lThigh;
	public ModelRenderer	lWingBack1;
	public ModelRenderer	lShin;
	public ModelRenderer	lLegJoint;
	public ModelRenderer	lHindPaw;
	public ModelRenderer	lWingBack2;
	public ModelRenderer	rThigh;
	public ModelRenderer	rWingBack1;
	public ModelRenderer	rShin;
	public ModelRenderer	rLegJoint;
	public ModelRenderer	rHindPaw;
	public ModelRenderer	rWingBack2;
	public ModelRenderer	lDorsalPlate2;
	public ModelRenderer	rDorsalPlate2;
	public ModelRenderer	lArm2;
	public ModelRenderer	lShoulderJoint;
	public ModelRenderer	lWing1;
	public ModelRenderer	lForePaw;
	public ModelRenderer	lArmJoint;
	public ModelRenderer	lWing2;
	public ModelRenderer	lWing3;
	public ModelRenderer	rArm2;
	public ModelRenderer	rShoulderJoint;
	public ModelRenderer	rWing1;
	public ModelRenderer	rForePaw;
	public ModelRenderer	rArmJoint;
	public ModelRenderer	rWing2;
	public ModelRenderer	rWing3;
	public ModelRenderer	muzzlea;
	public ModelRenderer	lowerJaw01;
	public ModelRenderer	muzzleb;
	public ModelRenderer	nose;
	public ModelRenderer	rFang;
	public ModelRenderer	lFang;
	public ModelRenderer	muzzleSlope;
	public ModelRenderer	lowerJaw02;
	public ModelRenderer	lowerTeeth01;
	public ModelRenderer	lowerTeeth02;

	public ModelPredator() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.tail8b = new ModelRenderer(this, 9, 56);
		this.tail8b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tail8b.addBox(-0.35F, -0.65F, 0.0F, 1, 1, 3, 0.0F);
		this.lWing2 = new ModelRenderer(this, 106, 24);
		this.lWing2.setRotationPoint(-0.02F, -1.2F, 2.8F);
		this.lWing2.addBox(-0.5F, -8.0F, -1.0F, 1, 8, 2, 0.0F);
		this.setRotation(lWing2, 0.36425021489121656F, 0.0F, 0.0F);
		this.nose = new ModelRenderer(this, 99, 46);
		this.nose.setRotationPoint(-0.2F, 0.9F, -3.0F);
		this.nose.addBox(-2.0F, -1.5F, -1.0F, 4, 2, 3, 0.0F);
		this.setRotation(nose, 0.045553093477052F, 0.0F, 0.0F);
		this.lFang = new ModelRenderer(this, 56, 52);
		this.lFang.setRotationPoint(1.3F, 0.1F, 0.0F);
		this.lFang.addBox(-0.35F, 0.0F, -0.95F, 1, 3, 2, 0.0F);
		this.rArm1 = new ModelRenderer(this, 84, 11);
		this.rArm1.mirror = true;
		this.rArm1.setRotationPoint(-2.0F, 0.4F, -6.7F);
		this.rArm1.addBox(-3.0F, -1.0F, -1.8F, 3, 7, 4, 0.0F);
		this.setRotation(rArm1, 0.31869712141416456F, 0.0F, 0.0F);
		this.rFang = new ModelRenderer(this, 56, 52);
		this.rFang.mirror = true;
		this.rFang.setRotationPoint(-1.3F, 0.1F, 0.0F);
		this.rFang.addBox(-0.65F, 0.0F, -0.95F, 1, 3, 2, 0.0F);
		this.tail1 = new ModelRenderer(this, 0, 44);
		this.tail1.setRotationPoint(0.0F, -2.3F, 5.0F);
		this.tail1.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F);
		this.setRotation(tail1, -0.6373942428283291F, 0.0F, 0.0F);
		this.lowerJaw02 = new ModelRenderer(this, 80, 56);
		this.lowerJaw02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lowerJaw02.addBox(-0.15F, -0.2F, -4.6F, 2, 1, 5, 0.0F);
		this.rWing1 = new ModelRenderer(this, 97, 23);
		this.rWing1.mirror = true;
		this.rWing1.setRotationPoint(-3.6F, -1.1F, -1.1F);
		this.rWing1.addBox(-0.5F, -9.1F, -2.0F, 1, 11, 3, 0.0F);
		this.setRotation(rWing1, -0.8651597102135892F, 0.0F, 0.0F);
		this.muzzlea = new ModelRenderer(this, 74, 46);
		this.muzzlea.setRotationPoint(0.2F, -0.6F, -3.5F);
		this.muzzlea.addBox(-2.5F, -1.5F, -2.1F, 3, 3, 2, 0.0F);
		this.setRotation(muzzlea, 0.27314402793711257F, 0.0F, 0.0F);
		this.rDorsalPlate1 = new ModelRenderer(this, 43, 0);
		this.rDorsalPlate1.mirror = true;
		this.rDorsalPlate1.setRotationPoint(-2.5F, -2.8F, -6.8F);
		this.rDorsalPlate1.addBox(-1.0F, -3.2F, -1.5F, 2, 3, 3, 0.0F);
		this.chest = new ModelRenderer(this, 0, 0);
		this.chest.setRotationPoint(0.0F, 9.3F, 0.0F);
		this.chest.addBox(-3.5F, -3.0F, -10.0F, 7, 6, 8, 0.0F);
		this.lowerTeeth01 = new ModelRenderer(this, 96, 56);
		this.lowerTeeth01.setRotationPoint(0.0F, -0.3F, 0.0F);
		this.lowerTeeth01.addBox(-1.7F, -0.8F, -4.5F, 3, 1, 3, 0.0F);
		this.rWing2 = new ModelRenderer(this, 106, 24);
		this.rWing2.mirror = true;
		this.rWing2.setRotationPoint(0.02F, -1.2F, 2.8F);
		this.rWing2.addBox(-0.5F, -8.0F, -1.0F, 1, 8, 2, 0.0F);
		this.setRotation(rWing2, 0.36425021489121656F, 0.0F, 0.0F);
		this.rShin = new ModelRenderer(this, 36, 37);
		this.rShin.mirror = true;
		this.rShin.setRotationPoint(0.4F, 8.0F, -0.1F);
		this.rShin.addBox(-1.0F, -1.5F, -10.0F, 2, 3, 10, 0.0F);
		this.setRotation(rShin, 0.18203784098300857F, 0.0F, 0.0F);
		this.rForePaw = new ModelRenderer(this, 111, 14);
		this.rForePaw.mirror = true;
		this.rForePaw.setRotationPoint(0.0F, 9.1F, 0.0F);
		this.rForePaw.addBox(-1.5F, 0.0F, -4.4F, 3, 2, 5, 0.0F);
		this.setRotation(rForePaw, 0.6373942428283291F, 0.0F, 0.0F);
		this.neck = new ModelRenderer(this, 38, 9);
		this.neck.setRotationPoint(0.0F, 0.0F, -9.5F);
		this.neck.addBox(-2.0F, -2.1F, -3.8F, 4, 4, 4, 0.0F);
		this.setRotation(neck, -0.36425021489121656F, 0.0F, 0.0F);
		this.lHindPaw = new ModelRenderer(this, 59, 13);
		this.lHindPaw.setRotationPoint(0.0F, 0.0F, -9.3F);
		this.lHindPaw.addBox(-1.5F, -4.0F, -1.8F, 3, 5, 2, 0.0F);
		this.setRotation(lHindPaw, 0.5462880558742251F, 0.0F, 0.0F);
		this.head01 = new ModelRenderer(this, 74, 35);
		this.head01.setRotationPoint(-0.02F, 7.8F, -11.9F);
		this.head01.addBox(-2.5F, -2.3F, -4.0F, 5, 4, 4, 0.0F);
		this.setRotation(head01, 0.045553093477052F, 0.0F, 0.0F);
		this.tail4 = new ModelRenderer(this, 0, 51);
		this.tail4.setRotationPoint(0.0F, 0.0F, 2.8F);
		this.tail4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotation(tail4, 0.091106186954104F, 0.0F, 0.0F);
		this.torso = new ModelRenderer(this, 0, 16);
		this.torso.setRotationPoint(0.0F, 0.5F, -2.3F);
		this.torso.addBox(-3.0F, -3.0F, 0.0F, 6, 5, 6, 0.0F);
		this.setRotation(torso, 0.136659280431156F, 0.0F, 0.0F);
		this.lowerJaw01 = new ModelRenderer(this, 64, 56);
		this.lowerJaw01.setRotationPoint(-0.05F, 1.2F, -2.1F);
		this.lowerJaw01.addBox(-1.75F, -0.2F, -4.6F, 2, 1, 5, 0.0F);
		this.setRotation(lowerJaw01, 0.045553093477052F, 0.0F, 0.0F);
		this.lThigh = new ModelRenderer(this, 47, 20);
		this.lThigh.setRotationPoint(2.0F, 0.0F, -1.6F);
		this.lThigh.addBox(-0.1F, -2.2F, -1.2F, 2, 10, 5, 0.0F);
		this.setRotation(lThigh, 0.5918411493512771F, 0.0F, 0.0F);
		this.rWing3 = new ModelRenderer(this, 114, 22);
		this.rWing3.mirror = true;
		this.rWing3.setRotationPoint(0.01F, -3.3F, 0.9F);
		this.rWing3.addBox(-0.5F, 0.0F, 0.0F, 1, 5, 5, 0.0F);
		this.setRotation(rWing3, -0.22759093446006054F, 0.0F, 0.0F);
		this.lWing1 = new ModelRenderer(this, 97, 23);
		this.lWing1.setRotationPoint(3.6F, -1.1F, -1.1F);
		this.lWing1.addBox(-0.5F, -9.1F, -2.0F, 1, 11, 3, 0.0F);
		this.setRotation(lWing1, -0.8651597102135892F, 0.0F, 0.0F);
		this.rWingBack2 = new ModelRenderer(this, 73, 24);
		this.rWingBack2.mirror = true;
		this.rWingBack2.setRotationPoint(0.18F, -1.2F, 2.8F);
		this.rWingBack2.addBox(0.0F, -6.0F, -1.6F, 1, 6, 2, 0.0F);
		this.setRotation(rWingBack2, 0.36425021489121656F, 0.0F, 0.0F);
		this.rDorsalPlate2 = new ModelRenderer(this, 58, 0);
		this.rDorsalPlate2.mirror = true;
		this.rDorsalPlate2.setRotationPoint(0.0F, -3.0F, 1.7F);
		this.rDorsalPlate2.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotation(rDorsalPlate2, 0.2617993877991494F, 0.0F, 0.0F);
		this.tail3 = new ModelRenderer(this, 24, 44);
		this.tail3.setRotationPoint(0.0F, 0.0F, 2.7F);
		this.tail3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
		this.setRotation(tail3, -0.18203784098300857F, 0.0F, 0.0F);
		this.lWingBack2 = new ModelRenderer(this, 73, 24);
		this.lWingBack2.setRotationPoint(-0.02F, -1.2F, 2.8F);
		this.lWingBack2.addBox(0.0F, -6.0F, -1.6F, 1, 6, 2, 0.0F);
		this.setRotation(lWingBack2, 0.36425021489121656F, 0.0F, 0.0F);
		this.tail8c = new ModelRenderer(this, 19, 56);
		this.tail8c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tail8c.addBox(-0.35F, -0.35F, 0.0F, 1, 1, 3, 0.0F);
		this.lowerTeeth02 = new ModelRenderer(this, 109, 56);
		this.lowerTeeth02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lowerTeeth02.addBox(0.8F, -0.8F, -4.5F, 1, 1, 3, 0.0F);
		this.tail8a = new ModelRenderer(this, 0, 56);
		this.tail8a.setRotationPoint(0.0F, 0.0F, 2.9F);
		this.tail8a.addBox(-0.65F, -0.65F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotation(tail8a, 0.22759093446006054F, 0.0F, 0.0F);
		this.tail9 = new ModelRenderer(this, 38, 56);
		this.tail9.setRotationPoint(0.0F, -0.2F, 2.7F);
		this.tail9.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotation(tail9, 0.22759093446006054F, 0.0F, 0.0F);
		this.lArm2 = new ModelRenderer(this, 99, 11);
		this.lArm2.setRotationPoint(1.6F, 5.7F, 1.2F);
		this.lArm2.addBox(-1.0F, 2.1F, -1.5F, 2, 8, 3, 0.0F);
		this.setRotation(lArm2, -0.9560913642424937F, 0.0F, 0.0F);
		this.lDorsalPlate1 = new ModelRenderer(this, 43, 0);
		this.lDorsalPlate1.setRotationPoint(2.5F, -2.8F, -6.8F);
		this.lDorsalPlate1.addBox(-1.0F, -3.2F, -1.5F, 2, 3, 3, 0.0F);
		this.tail5 = new ModelRenderer(this, 9, 51);
		this.tail5.setRotationPoint(0.0F, 0.0F, 2.8F);
		this.tail5.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
		this.setRotation(tail5, 0.22759093446006054F, 0.0F, 0.0F);
		this.rArmJoint = new ModelRenderer(this, 111, 0);
		this.rArmJoint.mirror = true;
		this.rArmJoint.setRotationPoint(0.0F, 1.5F, 0.2F);
		this.rArmJoint.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		this.setRotation(rArmJoint, 0.7853981633974483F, 0.0F, 0.0F);
		this.rear = new ModelRenderer(this, 0, 30);
		this.rear.setRotationPoint(0.0F, -0.1F, 5.7F);
		this.rear.addBox(-3.5F, -3.3F, -0.4F, 7, 6, 6, 0.0F);
		this.setRotation(rear, -0.136659280431156F, 0.0F, 0.0F);
		this.lForePaw = new ModelRenderer(this, 111, 14);
		this.lForePaw.setRotationPoint(0.0F, 9.1F, 0.0F);
		this.lForePaw.addBox(-1.5F, 0.0F, -4.4F, 3, 2, 5, 0.0F);
		this.setRotation(lForePaw, 0.6373942428283291F, 0.0F, 0.0F);
		this.lLegJoint = new ModelRenderer(this, 111, 0);
		this.lLegJoint.setRotationPoint(0.0F, 0.1F, 0.3F);
		this.lLegJoint.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		this.setRotation(lLegJoint, -0.7853981633974483F, 0.0F, 0.0F);
		this.lDorsalPlate2 = new ModelRenderer(this, 58, 0);
		this.lDorsalPlate2.setRotationPoint(0.0F, -3.0F, 1.7F);
		this.lDorsalPlate2.addBox(-0.5F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotation(lDorsalPlate2, 0.2617993877991494F, 0.0F, 0.0F);
		this.lThighJoint = new ModelRenderer(this, 29, 20);
		this.lThighJoint.setRotationPoint(2.2F, -0.3F, 2.1F);
		this.lThighJoint.addBox(0.5F, -1.5F, -1.5F, 5, 3, 3, 0.0F);
		this.setRotation(lThighJoint, 0.22759093446006054F, 0.0F, 0.0F);
		this.rThigh = new ModelRenderer(this, 47, 20);
		this.rThigh.mirror = true;
		this.rThigh.setRotationPoint(-3.0F, 0.0F, -1.6F);
		this.rThigh.addBox(-0.7F, -2.2F, -1.2F, 2, 10, 5, 0.0F);
		this.setRotation(rThigh, 0.5918411493512771F, 0.0F, 0.0F);
		this.muzzleSlope = new ModelRenderer(this, 113, 46);
		this.muzzleSlope.setRotationPoint(0.0F, -1.0F, -0.9F);
		this.muzzleSlope.addBox(-2.0F, -0.5F, 0.0F, 4, 1, 3, 0.0F);
		this.setRotation(muzzleSlope, 0.27314402793711257F, 0.0F, 0.0F);
		this.lShin = new ModelRenderer(this, 36, 37);
		this.lShin.setRotationPoint(0.9F, 8.0F, -0.1F);
		this.lShin.addBox(-1.0F, -1.5F, -10.0F, 2, 3, 10, 0.0F);
		this.setRotation(lShin, 0.18203784098300857F, 0.0F, 0.0F);
		this.rThighJoint = new ModelRenderer(this, 29, 20);
		this.rThighJoint.mirror = true;
		this.rThighJoint.setRotationPoint(-2.2F, -0.3F, 2.1F);
		this.rThighJoint.addBox(-5.5F, -1.5F, -1.5F, 5, 3, 3, 0.0F);
		this.setRotation(rThighJoint, 0.22759093446006054F, 0.0F, 0.0F);
		this.lWingBack1 = new ModelRenderer(this, 64, 23);
		this.lWingBack1.setRotationPoint(3.2F, -0.4F, -1.2F);
		this.lWingBack1.addBox(0.1F, -7.0F, -2.0F, 1, 7, 3, 0.0F);
		this.setRotation(lWingBack1, -0.8651597102135892F, 0.0F, 0.0F);
		this.rArm2 = new ModelRenderer(this, 99, 11);
		this.rArm2.mirror = true;
		this.rArm2.setRotationPoint(-1.6F, 5.7F, 1.2F);
		this.rArm2.addBox(-1.0F, 2.1F, -1.5F, 2, 8, 3, 0.0F);
		this.setRotation(rArm2, -0.9560913642424937F, 0.0F, 0.0F);
		this.rWingBack1 = new ModelRenderer(this, 64, 23);
		this.rWingBack1.mirror = true;
		this.rWingBack1.setRotationPoint(-4.2F, -0.4F, -1.2F);
		this.rWingBack1.addBox(0.1F, -7.0F, -2.0F, 1, 7, 3, 0.0F);
		this.setRotation(rWingBack1, -0.8651597102135892F, 0.0F, 0.0F);
		this.lWing3 = new ModelRenderer(this, 114, 22);
		this.lWing3.setRotationPoint(-0.01F, -3.3F, 0.9F);
		this.lWing3.addBox(-0.5F, 0.0F, 0.0F, 1, 5, 5, 0.0F);
		this.setRotation(lWing3, -0.22759093446006054F, 0.0F, 0.0F);
		this.lShoulderJoint = new ModelRenderer(this, 95, 0);
		this.lShoulderJoint.setRotationPoint(3.1F, -0.8F, 0.2F);
		this.lShoulderJoint.addBox(-1.8F, -2.0F, -2.0F, 3, 4, 4, 0.0F);
		this.setRotation(lShoulderJoint, 1.1838568316277536F, 0.0F, 0.0F);
		this.tail6 = new ModelRenderer(this, 19, 51);
		this.tail6.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.tail6.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotation(tail6, 0.18203784098300857F, 0.0F, 0.0F);
		this.tail2 = new ModelRenderer(this, 13, 44);
		this.tail2.setRotationPoint(0.0F, 0.0F, 2.7F);
		this.tail2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
		this.setRotation(tail2, -0.22759093446006054F, 0.0F, 0.0F);
		this.tail8d = new ModelRenderer(this, 28, 56);
		this.tail8d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tail8d.addBox(-0.65F, -0.35F, 0.0F, 1, 1, 3, 0.0F);
		this.rShoulderJoint = new ModelRenderer(this, 95, 0);
		this.rShoulderJoint.mirror = true;
		this.rShoulderJoint.setRotationPoint(-2.5F, -0.8F, 0.2F);
		this.rShoulderJoint.addBox(-1.8F, -2.0F, -2.0F, 3, 4, 4, 0.0F);
		this.setRotation(rShoulderJoint, 0.7330382858376184F, 0.0F, 0.0F);
		this.rLegJoint = new ModelRenderer(this, 111, 0);
		this.rLegJoint.mirror = true;
		this.rLegJoint.setRotationPoint(0.0F, 0.1F, 0.3F);
		this.rLegJoint.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		this.setRotation(rLegJoint, -0.7853981633974483F, 0.0F, 0.0F);
		this.lArmJoint = new ModelRenderer(this, 111, 0);
		this.lArmJoint.setRotationPoint(0.0F, 1.5F, 0.2F);
		this.lArmJoint.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
		this.setRotation(lArmJoint, 0.7853981633974483F, 0.0F, 0.0F);
		this.mDorsalPlate = new ModelRenderer(this, 68, 0);
		this.mDorsalPlate.setRotationPoint(0.0F, -2.8F, -9.1F);
		this.mDorsalPlate.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 5, 0.0F);
		this.setRotation(mDorsalPlate, -0.27314402793711257F, 0.0F, 0.0F);
		this.rHindPaw = new ModelRenderer(this, 59, 13);
		this.rHindPaw.mirror = true;
		this.rHindPaw.setRotationPoint(0.0F, 0.0F, -9.3F);
		this.rHindPaw.addBox(-1.5F, -4.0F, -1.8F, 3, 5, 2, 0.0F);
		this.setRotation(rHindPaw, 0.5462880558742251F, 0.0F, 0.0F);
		this.muzzleb = new ModelRenderer(this, 88, 46);
		this.muzzleb.setRotationPoint(0.9F, 0.0F, 0.0F);
		this.muzzleb.addBox(-0.8F, -1.5F, -2.1F, 2, 3, 2, 0.0F);
		this.lArm1 = new ModelRenderer(this, 84, 11);
		this.lArm1.setRotationPoint(2.0F, 0.4F, -6.7F);
		this.lArm1.addBox(0.0F, -1.0F, -1.8F, 3, 7, 4, 0.0F);
		this.setRotation(lArm1, 0.31869712141416456F, 0.0F, 0.0F);
		this.tail7 = new ModelRenderer(this, 28, 51);
		this.tail7.setRotationPoint(0.0F, 0.0F, 2.7F);
		this.tail7.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
		this.setRotation(tail7, 0.22759093446006054F, 0.0F, 0.0F);
		this.tail8a.addChild(this.tail8b);
		this.lWing1.addChild(this.lWing2);
		this.muzzlea.addChild(this.nose);
		this.nose.addChild(this.lFang);
		this.chest.addChild(this.rArm1);
		this.nose.addChild(this.rFang);
		this.rear.addChild(this.tail1);
		this.lowerJaw01.addChild(this.lowerJaw02);
		this.rArm1.addChild(this.rWing1);
		this.head01.addChild(this.muzzlea);
		this.chest.addChild(this.rDorsalPlate1);
		this.lowerJaw01.addChild(this.lowerTeeth01);
		this.rWing1.addChild(this.rWing2);
		this.rThigh.addChild(this.rShin);
		this.rArm2.addChild(this.rForePaw);
		this.chest.addChild(this.neck);
		this.lShin.addChild(this.lHindPaw);
		this.tail3.addChild(this.tail4);
		this.chest.addChild(this.torso);
		this.head01.addChild(this.lowerJaw01);
		this.lThighJoint.addChild(this.lThigh);
		this.rWing1.addChild(this.rWing3);
		this.lArm1.addChild(this.lWing1);
		this.rWingBack1.addChild(this.rWingBack2);
		this.rDorsalPlate1.addChild(this.rDorsalPlate2);
		this.tail2.addChild(this.tail3);
		this.lWingBack1.addChild(this.lWingBack2);
		this.tail8a.addChild(this.tail8c);
		this.lowerTeeth01.addChild(this.lowerTeeth02);
		this.tail7.addChild(this.tail8a);
		this.tail8a.addChild(this.tail9);
		this.lArm1.addChild(this.lArm2);
		this.chest.addChild(this.lDorsalPlate1);
		this.tail4.addChild(this.tail5);
		this.rArm2.addChild(this.rArmJoint);
		this.torso.addChild(this.rear);
		this.lArm2.addChild(this.lForePaw);
		this.lShin.addChild(this.lLegJoint);
		this.lDorsalPlate1.addChild(this.lDorsalPlate2);
		this.rear.addChild(this.lThighJoint);
		this.rThighJoint.addChild(this.rThigh);
		this.nose.addChild(this.muzzleSlope);
		this.lThigh.addChild(this.lShin);
		this.rear.addChild(this.rThighJoint);
		this.lThighJoint.addChild(this.lWingBack1);
		this.rArm1.addChild(this.rArm2);
		this.rThighJoint.addChild(this.rWingBack1);
		this.lWing1.addChild(this.lWing3);
		this.lArm1.addChild(this.lShoulderJoint);
		this.tail5.addChild(this.tail6);
		this.tail1.addChild(this.tail2);
		this.tail8a.addChild(this.tail8d);
		this.rArm1.addChild(this.rShoulderJoint);
		this.rShin.addChild(this.rLegJoint);
		this.lArm2.addChild(this.lArmJoint);
		this.chest.addChild(this.mDorsalPlate);
		this.rShin.addChild(this.rHindPaw);
		this.muzzlea.addChild(this.muzzleb);
		this.chest.addChild(this.lArm1);
		this.tail6.addChild(this.tail7);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		this.chest.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.head01.offsetX, this.head01.offsetY, this.head01.offsetZ);
		GlStateManager.translate(this.head01.rotationPointX * f5, this.head01.rotationPointY * f5, this.head01.rotationPointZ * f5);
		GlStateManager.scale(1.05D, 1.05D, 1.0D);
		GlStateManager.translate(-this.head01.offsetX, -this.head01.offsetY, -this.head01.offsetZ);
		GlStateManager.translate(-this.head01.rotationPointX * f5, -this.head01.rotationPointY * f5, -this.head01.rotationPointZ * f5);
		this.head01.render(f5);
		GlStateManager.popMatrix();
	}

	@Override
	public void render(Object obj) {
		EntityLivingBase base = (EntityLivingBase) obj;
		head01.rotateAngleX = headPitch(obj) * 0.017453292F + 6.5F;
		head01.rotateAngleY = headYaw(obj) * 0.017453292F;
		lowerJaw01.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.01F) * 0.667F * swingProgressPrev(obj) + 0.4F;
		lThighJoint.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.9F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		lLegJoint.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.9F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		rThighJoint.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.8F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		rLegJoint.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.9F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		lArm1.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.8F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		lArmJoint.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.9F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		rArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.9F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		rArmJoint.rotateAngleX = MathHelper.sin(swingProgress(obj) * 0.9F) * 0.667F * swingProgressPrev(obj) + 0.3F;
		tail2.rotateAngleZ = MathHelper.sin(swingProgress(obj) * 0.8F) * 0.667F * swingProgressPrev(obj);
		tail3.rotateAngleY = MathHelper.sin(swingProgress(obj) * 0.8F) * 0.667F * swingProgressPrev(obj);
		tail4.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.8F) * 0.337F * swingProgressPrev(obj);
		tail5.rotateAngleY = MathHelper.cos(swingProgress(obj) * 0.8F) * 0.337F * swingProgressPrev(obj);
		tail6.rotateAngleZ = MathHelper.cos(swingProgress(obj) * 0.8F) * 0.227F * swingProgressPrev(obj);
		tail7.rotateAngleY = MathHelper.sin(swingProgress(obj) * 0.8F) * 0.117F * swingProgressPrev(obj);
	}
}