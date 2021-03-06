package com.hypeirochus.scmc.client.renderer.model;

import com.hypeirochus.api.client.render.model.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * adept - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelAdept extends Model {
	public ModelRenderer	floatyBackThing1;
	public ModelRenderer	neck;
	public ModelRenderer	chestUpper;
	public ModelRenderer	floatyBackThingL;
	public ModelRenderer	floatyBackThingR;
	public ModelRenderer	floatyBackDisc1;
	public ModelRenderer	floatyBackThingL2;
	public ModelRenderer	floatyBackThingL3;
	public ModelRenderer	floatyBackThingL4;
	public ModelRenderer	floatyBackThingR2;
	public ModelRenderer	floatyBackThingR3;
	public ModelRenderer	floatyBackThingR4;
	public ModelRenderer	floatyBackDiscT;
	public ModelRenderer	floatyBackDiscL;
	public ModelRenderer	floatyBackDiscR;
	public ModelRenderer	floatyBackDiscB;
	public ModelRenderer	head;
	public ModelRenderer	headBack;
	public ModelRenderer	headBack2;
	public ModelRenderer	eyes;
	public ModelRenderer	lSkullSlant;
	public ModelRenderer	rSkullSlant;
	public ModelRenderer	lSkullSlant2;
	public ModelRenderer	rSkullSlant2;
	public ModelRenderer	mouthIGuess;
	public ModelRenderer	headTendrilBundle;
	public ModelRenderer	headTendrilBundle2;
	public ModelRenderer	headTendrilBundle3;
	public ModelRenderer	headTendrilBundle4;
	public ModelRenderer	abdomen;
	public ModelRenderer	shoulders;
	public ModelRenderer	breasts;
	public ModelRenderer	waist;
	public ModelRenderer	legLeft1;
	public ModelRenderer	legRight1;
	public ModelRenderer	waistGuard1;
	public ModelRenderer	legLeft2;
	public ModelRenderer	legLeft3;
	public ModelRenderer	legLeft4;
	public ModelRenderer	legLeft5;
	public ModelRenderer	footLeft;
	public ModelRenderer	footLeftUpper;
	public ModelRenderer	toeLeftLeft;
	public ModelRenderer	toeLeftRight;
	public ModelRenderer	legRight2;
	public ModelRenderer	legRight3;
	public ModelRenderer	legRight4;
	public ModelRenderer	legRight5;
	public ModelRenderer	footRight;
	public ModelRenderer	footRightUpper;
	public ModelRenderer	toeRightRight;
	public ModelRenderer	toeRightLeft;
	public ModelRenderer	waistGuard2;
	public ModelRenderer	waistGuardL1;
	public ModelRenderer	waistGuard3;
	public ModelRenderer	waistGuardR1;
	public ModelRenderer	waistGuardL2;
	public ModelRenderer	waistGuardL3;
	public ModelRenderer	clothL1;
	public ModelRenderer	waistGuardL4;
	public ModelRenderer	waistGuardL5;
	public ModelRenderer	clothL3;
	public ModelRenderer	clothL4;
	public ModelRenderer	clothL2;
	public ModelRenderer	waistGuard4;
	public ModelRenderer	waistGuardR2;
	public ModelRenderer	waistGuardR3;
	public ModelRenderer	clothR1;
	public ModelRenderer	waistGuardR4;
	public ModelRenderer	waistGuardR5;
	public ModelRenderer	clothR3;
	public ModelRenderer	clothR4;
	public ModelRenderer	clothR2;
	public ModelRenderer	shoulderGuardLeft1;
	public ModelRenderer	shoulderGuardRight1;
	public ModelRenderer	armLeft1;
	public ModelRenderer	armRight1;
	public ModelRenderer	shoulderGuardLeft2;
	public ModelRenderer	shoulderGuardRight2;
	public ModelRenderer	lForearm;
	public ModelRenderer	armLeft2;
	public ModelRenderer	glaiveCannon1;
	public ModelRenderer	glaiveCannonSpike1;
	public ModelRenderer	glaiveCannonSpike2;
	public ModelRenderer	glaiveCannon2;
	public ModelRenderer	glaiveCannonProng1;
	public ModelRenderer	glaiveCannonProng2;
	public ModelRenderer	glaiveCannonFrame1;
	public ModelRenderer	glaiveCannonFrame2;
	public ModelRenderer	rForearm;
	public ModelRenderer	rFist;
	public ModelRenderer	armRight2;

	public ModelAdept() {
		this.textureWidth = 256;
		this.textureHeight = 128;
		this.floatyBackThingR3 = new ModelRenderer(this, 191, 80);
		this.floatyBackThingR3.mirror = true;
		this.floatyBackThingR3.setRotationPoint(-4.8F, -1.1F, 0.0F);
		this.floatyBackThingR3.addBox(-4.0F, -2.0F, -1.5F, 7, 4, 3, 0.0F);
		this.setRotation(floatyBackThingR3, 0.0F, 0.0F, 0.4553564018453205F);
		this.head = new ModelRenderer(this, 166, 0);
		this.head.setRotationPoint(0.0F, -4.0F, 0.7F);
		this.head.addBox(-3.0F, -2.0F, -2.0F, 6, 4, 3, 0.0F);
		this.setRotation(head, -0.8196066167365371F, 0.0F, 0.0F);
		this.waistGuardR2 = new ModelRenderer(this, 59, 30);
		this.waistGuardR2.mirror = true;
		this.waistGuardR2.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.waistGuardR2.addBox(-1.0F, -1.4F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotation(waistGuardR2, 0.7740535232594852F, 0.0F, 0.0F);
		this.rForearm = new ModelRenderer(this, 129, 90);
		this.rForearm.setRotationPoint(-2.0F, 11.3F, 0.0F);
		this.rForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
		this.setRotation(rForearm, 0.7740535232594852F, 0.0F, 0.0F);
		this.neck = new ModelRenderer(this, 189, 21);
		this.neck.setRotationPoint(0.0F, -20.3F, 3.2F);
		this.neck.addBox(-2.5F, -3.2F, -1.4F, 5, 5, 4, 0.0F);
		this.setRotation(neck, 0.6829473363053812F, 0.0F, 0.0F);
		this.floatyBackThingR4 = new ModelRenderer(this, 191, 89);
		this.floatyBackThingR4.mirror = true;
		this.floatyBackThingR4.setRotationPoint(-3.4F, 8.4F, 0.0F);
		this.floatyBackThingR4.addBox(-2.0F, -4.0F, -1.5F, 4, 8, 3, 0.0F);
		this.setRotation(floatyBackThingR4, 0.0F, 0.0F, 0.136659280431156F);
		this.floatyBackDiscT = new ModelRenderer(this, 225, 66);
		this.floatyBackDiscT.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.floatyBackDiscT.addBox(-2.5F, -4.0F, -0.5F, 5, 2, 1, 0.0F);
		this.headBack2 = new ModelRenderer(this, 166, 27);
		this.headBack2.setRotationPoint(0.0F, -1.0F, -0.8F);
		this.headBack2.addBox(-3.0F, -7.0F, -0.8F, 6, 8, 2, 0.0F);
		this.setRotation(headBack2, -0.7740535232594852F, 0.0F, 0.0F);
		this.chestUpper = new ModelRenderer(this, 0, 18);
		this.chestUpper.setRotationPoint(0.0F, -19.0F, 0.0F);
		this.chestUpper.addBox(-6.5F, 2.8F, 0.3F, 13, 9, 8, 0.0F);
		this.waist = new ModelRenderer(this, 0, 73);
		this.waist.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.waist.addBox(-6.0F, 17.5F, -4.0F, 12, 5, 8, 0.0F);
		this.mouthIGuess = new ModelRenderer(this, 166, 9);
		this.mouthIGuess.setRotationPoint(0.0F, 1.6F, -1.2F);
		this.mouthIGuess.addBox(-1.5F, -0.4F, -1.0F, 3, 3, 2, 0.0F);
		this.setRotation(mouthIGuess, 0.045553093477052F, 0.0F, 0.0F);
		this.floatyBackDiscR = new ModelRenderer(this, 225, 66);
		this.floatyBackDiscR.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.floatyBackDiscR.addBox(-2.5F, -4.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotation(floatyBackDiscR, 0.0F, 0.0F, -1.5707963267948966F);
		this.armLeft1 = new ModelRenderer(this, 126, 0);
		this.armLeft1.mirror = true;
		this.armLeft1.setRotationPoint(8.0F, 0.0F, 4.0F);
		this.armLeft1.addBox(-2.0F, 0.0F, -2.0F, 4, 13, 4, 0.0F);
		this.setRotation(armLeft1, 0.18203784098300857F, -0.0F, -0.40980330836826856F);
		this.armLeft2 = new ModelRenderer(this, 126, 42);
		this.armLeft2.setRotationPoint(2.6F, 0.0F, -3.5F);
		this.armLeft2.addBox(-6.3F, -3.0F, -11.0F, 5, 6, 8, 0.0F);
		this.setRotation(armLeft2, 0.0F, -0.18203784098300857F, 0.0F);
		this.floatyBackDisc1 = new ModelRenderer(this, 225, 55);
		this.floatyBackDisc1.setRotationPoint(0.0F, 8.5F, -1.0F);
		this.floatyBackDisc1.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 2, 0.0F);
		this.setRotation(floatyBackDisc1, 0.0F, 0.0F, -0.7853981633974483F);
		this.legLeft5 = new ModelRenderer(this, 92, 65);
		this.legLeft5.mirror = true;
		this.legLeft5.setRotationPoint(0.0F, 0.6F, 2.8F);
		this.legLeft5.addBox(-2.02F, 0.0F, -2.5F, 4, 14, 5, 0.0F);
		this.setRotation(legLeft5, -0.5918411493512771F, 0.0F, 0.0F);
		this.clothL4 = new ModelRenderer(this, 107, 62);
		this.clothL4.setRotationPoint(9.8F, 0.0F, -0.2F);
		this.clothL4.addBox(0.1F, -0.5F, -6.5F, 11, 0, 13, 0.0F);
		this.setRotation(clothL4, 0.0F, 0.0F, 0.22759093446006054F);
		this.floatyBackDiscL = new ModelRenderer(this, 225, 66);
		this.floatyBackDiscL.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.floatyBackDiscL.addBox(-2.5F, -4.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotation(floatyBackDiscL, 0.0F, 0.0F, 1.5707963267948966F);
		this.footLeft = new ModelRenderer(this, 92, 86);
		this.footLeft.mirror = true;
		this.footLeft.setRotationPoint(0.0F, 12.1F, 0.2F);
		this.footLeft.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
		this.setRotation(footLeft, 0.5918411493512771F, 0.0F, 0.0F);
		this.footLeftUpper = new ModelRenderer(this, 92, 99);
		this.footLeftUpper.mirror = true;
		this.footLeftUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.footLeftUpper.addBox(-2.0F, -3.5F, -4.9F, 4, 2, 4, 0.0F);
		this.setRotation(footLeftUpper, 0.6373942428283291F, 0.0F, 0.0F);
		this.clothR3 = new ModelRenderer(this, 60, 63);
		this.clothR3.setRotationPoint(-3.4F, 0.8F, -1.5F);
		this.clothR3.addBox(-10.1F, -0.5F, -5.5F, 10, 0, 11, 0.0F);
		this.setRotation(clothR3, 0.0F, 0.0F, -0.40980330836826856F);
		this.glaiveCannonFrame2 = new ModelRenderer(this, 60, 86);
		this.glaiveCannonFrame2.mirror = true;
		this.glaiveCannonFrame2.setRotationPoint(1.0F, 3.2F, 1.3F);
		this.glaiveCannonFrame2.addBox(-1.0F, -2.0F, -5.0F, 2, 3, 10, 0.0F);
		this.setRotation(glaiveCannonFrame2, 0.27314402793711257F, 0.0F, 0.0F);
		this.legRight3 = new ModelRenderer(this, 92, 36);
		this.legRight3.setRotationPoint(-0.7F, 0.2F, 1.0F);
		this.legRight3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
		this.setRotation(legRight3, 0.27314402793711257F, -0.22759093446006054F, 0.0F);
		this.toeRightRight = new ModelRenderer(this, 92, 106);
		this.toeRightRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toeRightRight.addBox(-2.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
		this.rFist = new ModelRenderer(this, 134, 110);
		this.rFist.setRotationPoint(0.0F, 0.0F, -12.0F);
		this.rFist.addBox(-2.1F, -2.5F, -4.1F, 5, 5, 5, 0.0F);
		this.setRotation(rFist, 0.0F, -0.136659280431156F, 0.0F);
		this.legLeft4 = new ModelRenderer(this, 92, 53);
		this.legLeft4.mirror = true;
		this.legLeft4.setRotationPoint(0.0F, -0.9F, 7.0F);
		this.legLeft4.addBox(-2.0F, -2.2F, 1.9F, 4, 4, 3, 0.0F);
		this.setRotation(legLeft4, -0.27314402793711257F, 0.0F, 0.0F);
		this.rSkullSlant2 = new ModelRenderer(this, 200, 5);
		this.rSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rSkullSlant2.addBox(-3.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
		this.setRotation(rSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
		this.waistGuard2 = new ModelRenderer(this, 74, 21);
		this.waistGuard2.setRotationPoint(0.0F, 7.6F, -1.4F);
		this.waistGuard2.addBox(-3.5F, 0.0F, -0.5F, 7, 7, 2, 0.0F);
		this.setRotation(waistGuard2, 0.22759093446006054F, 0.0F, 0.0F);
		this.armRight2 = new ModelRenderer(this, 126, 21);
		this.armRight2.setRotationPoint(0.0F, 0.0F, 1.4F);
		this.armRight2.addBox(-3.0F, -3.0F, -11.0F, 6, 6, 8, 0.0F);
		this.breasts = new ModelRenderer(this, 0, 41);
		this.breasts.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.breasts.addBox(-6.0F, 0.2F, 0.8F, 12, 6, 4, 0.0F);
		this.setRotation(breasts, -0.6373942428283291F, 0.0F, 0.0F);
		this.waistGuard3 = new ModelRenderer(this, 64, 0);
		this.waistGuard3.setRotationPoint(0.0F, -0.5F, 6.8F);
		this.waistGuard3.addBox(-5.5F, 0.0F, -1.0F, 11, 6, 2, 0.0F);
		this.setRotation(waistGuard3, 0.31869712141416456F, 0.0F, 0.0F);
		this.toeLeftRight = new ModelRenderer(this, 92, 106);
		this.toeLeftRight.mirror = true;
		this.toeLeftRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toeLeftRight.addBox(-2.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
		this.shoulderGuardRight2 = new ModelRenderer(this, 161, 102);
		this.shoulderGuardRight2.setRotationPoint(-0.2F, 0.0F, 0.0F);
		this.shoulderGuardRight2.addBox(-7.5F, -5.2F, -3.0F, 6, 4, 6, 0.0F);
		this.setRotation(shoulderGuardRight2, 0.0F, 0.0F, 0.9105382707654417F);
		this.footRight = new ModelRenderer(this, 92, 86);
		this.footRight.setRotationPoint(0.0F, 12.1F, 0.2F);
		this.footRight.addBox(-3.0F, 0.0F, -7.0F, 6, 3, 8, 0.0F);
		this.setRotation(footRight, 0.5918411493512771F, 0.0F, 0.0F);
		this.floatyBackThingL2 = new ModelRenderer(this, 191, 69);
		this.floatyBackThingL2.setRotationPoint(9.5F, -4.1F, 0.0F);
		this.floatyBackThingL2.addBox(-3.0F, -2.0F, -1.5F, 6, 4, 3, 0.0F);
		this.setRotation(floatyBackThingL2, 0.0F, 0.0F, 0.4553564018453205F);
		this.shoulders = new ModelRenderer(this, 0, 0);
		this.shoulders.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shoulders.addBox(-11.1F, -1.6F, 0.5F, 22, 6, 8, 0.0F);
		this.glaiveCannonProng1 = new ModelRenderer(this, 60, 103);
		this.glaiveCannonProng1.setRotationPoint(-0.3F, -3.7F, -6.5F);
		this.glaiveCannonProng1.addBox(-1.0F, -2.0F, -8.7F, 2, 6, 16, 0.0F);
		this.setRotation(glaiveCannonProng1, 0.18203784098300857F, 0.0F, 0.0F);
		this.floatyBackThingL = new ModelRenderer(this, 191, 58);
		this.floatyBackThingL.setRotationPoint(-1.0F, 0.0F, 0.0F);
		this.floatyBackThingL.addBox(0.6F, -7.2F, -1.5F, 7, 4, 3, 0.0F);
		this.setRotation(floatyBackThingL, 0.0F, 0.0F, 0.9105382707654417F);
		this.headTendrilBundle = new ModelRenderer(this, 210, 2);
		this.headTendrilBundle.setRotationPoint(0.0F, -1.6F, 1.8F);
		this.headTendrilBundle.addBox(-1.5F, -0.9F, -0.7F, 3, 3, 5, 0.0F);
		this.setRotation(headTendrilBundle, -0.31869712141416456F, 0.0F, 0.0F);
		this.toeLeftLeft = new ModelRenderer(this, 92, 106);
		this.toeLeftLeft.mirror = true;
		this.toeLeftLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toeLeftLeft.addBox(0.5F, 0.9F, -9.5F, 2, 2, 4, 0.0F);
		this.floatyBackDiscB = new ModelRenderer(this, 225, 66);
		this.floatyBackDiscB.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.floatyBackDiscB.addBox(-2.5F, -4.0F, -0.5F, 5, 2, 1, 0.0F);
		this.setRotation(floatyBackDiscB, 0.0F, 0.0F, 3.141592653589793F);
		this.rSkullSlant = new ModelRenderer(this, 191, 6);
		this.rSkullSlant.mirror = true;
		this.rSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rSkullSlant.addBox(-3.5F, -0.8F, -0.5F, 2, 4, 1, 0.0F);
		this.setRotation(rSkullSlant, -0.36425021489121656F, 0.0F, -0.40980330836826856F);
		this.glaiveCannon1 = new ModelRenderer(this, 0, 92);
		this.glaiveCannon1.setRotationPoint(-2.1F, -0.1F, -7.1F);
		this.glaiveCannon1.addBox(-1.8F, -5.5F, -7.0F, 3, 11, 16, 0.0F);
		this.setRotation(glaiveCannon1, 0.0F, 0.5009094953223726F, 0.0F);
		this.floatyBackThingL3 = new ModelRenderer(this, 191, 80);
		this.floatyBackThingL3.setRotationPoint(4.8F, -1.1F, 0.0F);
		this.floatyBackThingL3.addBox(-3.0F, -2.0F, -1.5F, 7, 4, 3, 0.0F);
		this.setRotation(floatyBackThingL3, 0.0F, 0.0F, -0.4553564018453205F);
		this.headTendrilBundle2 = new ModelRenderer(this, 210, 13);
		this.headTendrilBundle2.setRotationPoint(0.0F, 0.3F, 3.3F);
		this.headTendrilBundle2.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotation(headTendrilBundle2, -0.5009094953223726F, 0.0F, 0.0F);
		this.waistGuardL4 = new ModelRenderer(this, 33, 50);
		this.waistGuardL4.setRotationPoint(0.8F, 0.0F, 2.0F);
		this.waistGuardL4.addBox(0.1F, -0.5F, -4.0F, 4, 1, 8, 0.0F);
		this.headTendrilBundle4 = new ModelRenderer(this, 213, 33);
		this.headTendrilBundle4.setRotationPoint(0.0F, -0.2F, 3.8F);
		this.headTendrilBundle4.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotation(headTendrilBundle4, -0.045553093477052F, 0.0F, 0.0F);
		this.waistGuardL2 = new ModelRenderer(this, 59, 30);
		this.waistGuardL2.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.waistGuardL2.addBox(-1.0F, -1.4F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotation(waistGuardL2, 0.7740535232594852F, 0.0F, -0.033995510864549175F);
		this.waistGuardR5 = new ModelRenderer(this, 62, 52);
		this.waistGuardR5.mirror = true;
		this.waistGuardR5.setRotationPoint(-3.6F, -0.1F, 0.0F);
		this.waistGuardR5.addBox(-8.1F, -0.5F, -2.0F, 8, 1, 4, 0.0F);
		this.setRotation(waistGuardR5, 0.0F, 0.0F, -0.4553564018453205F);
		this.lSkullSlant2 = new ModelRenderer(this, 200, 5);
		this.lSkullSlant2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lSkullSlant2.addBox(1.4F, -3.3F, 0.2F, 2, 4, 1, 0.0F);
		this.setRotation(lSkullSlant2, -0.7740535232594852F, 0.0F, 0.0F);
		this.floatyBackThingR = new ModelRenderer(this, 191, 58);
		this.floatyBackThingR.mirror = true;
		this.floatyBackThingR.setRotationPoint(1.0F, 0.0F, 0.0F);
		this.floatyBackThingR.addBox(-7.6F, -7.2F, -1.5F, 7, 4, 3, 0.0F);
		this.setRotation(floatyBackThingR, 0.0F, 0.0F, -0.9105382707654417F);
		this.clothL3 = new ModelRenderer(this, 60, 63);
		this.clothL3.setRotationPoint(3.4F, 0.8F, -1.5F);
		this.clothL3.addBox(0.1F, -0.5F, -5.5F, 10, 0, 11, 0.0F);
		this.setRotation(clothL3, 0.0F, 0.0F, 0.40980330836826856F);
		this.headTendrilBundle3 = new ModelRenderer(this, 212, 22);
		this.headTendrilBundle3.setRotationPoint(0.0F, -0.1F, 3.1F);
		this.headTendrilBundle3.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotation(headTendrilBundle3, -0.5918411493512771F, 0.0F, 0.0F);
		this.waistGuardL1 = new ModelRenderer(this, 49, 34);
		this.waistGuardL1.setRotationPoint(4.0F, 1.3F, -0.1F);
		this.waistGuardL1.addBox(-1.0F, -5.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotation(waistGuardL1, -0.5462880558742251F, 0.0F, 0.7285004297824331F);
		this.waistGuard1 = new ModelRenderer(this, 49, 19);
		this.waistGuard1.setRotationPoint(0.0F, 16.8F, -3.6F);
		this.waistGuard1.addBox(-4.5F, 1.8F, -2.0F, 9, 6, 2, 0.0F);
		this.setRotation(waistGuard1, -0.22759093446006054F, 0.0F, 0.0F);
		this.armRight1 = new ModelRenderer(this, 126, 1);
		this.armRight1.setRotationPoint(-7.0F, 0.6F, 4.0F);
		this.armRight1.addBox(-4.0F, 0.0F, -3.0F, 4, 13, 4, 0.0F);
		this.setRotation(armRight1, 0.36425021489121656F, -0.0F, 0.27314402793711257F);
		this.lSkullSlant = new ModelRenderer(this, 191, 6);
		this.lSkullSlant.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lSkullSlant.addBox(1.5F, -0.8F, -0.5F, 2, 4, 1, 0.0F);
		this.setRotation(lSkullSlant, -0.36425021489121656F, 0.0F, 0.40980330836826856F);
		this.waistGuardR4 = new ModelRenderer(this, 33, 50);
		this.waistGuardR4.mirror = true;
		this.waistGuardR4.setRotationPoint(-0.8F, 0.0F, 2.0F);
		this.waistGuardR4.addBox(-4.1F, -0.5F, -4.0F, 4, 1, 8, 0.0F);
		this.clothR1 = new ModelRenderer(this, 40, 66);
		this.clothR1.setRotationPoint(0.0F, -0.4F, -0.6F);
		this.clothR1.addBox(-12.0F, -2.0F, 0.0F, 12, 4, 0, 0.0F);
		this.setRotation(clothR1, 0.36425021489121656F, 0.22759093446006054F, -0.7285004297824331F);
		this.abdomen = new ModelRenderer(this, 0, 59);
		this.abdomen.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.abdomen.addBox(-5.0F, 11.6F, -2.2F, 10, 6, 5, 0.0F);
		this.glaiveCannonFrame1 = new ModelRenderer(this, 60, 86);
		this.glaiveCannonFrame1.setRotationPoint(1.0F, -1.7F, 1.1F);
		this.glaiveCannonFrame1.addBox(-1.0F, -2.0F, -5.0F, 2, 3, 10, 0.0F);
		this.setRotation(glaiveCannonFrame1, -0.27314402793711257F, 0.0F, 0.0F);
		this.clothL2 = new ModelRenderer(this, 40, 74);
		this.clothL2.setRotationPoint(11.9F, -0.4F, 0.0F);
		this.clothL2.addBox(0.0F, -2.0F, 0.0F, 10, 6, 0, 0.0F);
		this.setRotation(clothL2, 0.0F, -0.31869712141416456F, 0.0F);
		this.footRightUpper = new ModelRenderer(this, 92, 99);
		this.footRightUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.footRightUpper.addBox(-2.0F, -3.5F, -4.9F, 4, 2, 4, 0.0F);
		this.setRotation(footRightUpper, 0.6373942428283291F, 0.0F, 0.0F);
		this.eyes = new ModelRenderer(this, 192, 0);
		this.eyes.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.eyes.addBox(-2.5F, 0.1F, -1.9F, 5, 2, 2, 0.0F);
		this.setRotation(eyes, -1.2747884856566583F, 0.0F, 0.0F);
		this.legLeft3 = new ModelRenderer(this, 92, 36);
		this.legLeft3.mirror = true;
		this.legLeft3.setRotationPoint(0.7F, 0.2F, 1.0F);
		this.legLeft3.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 10, 0.0F);
		this.setRotation(legLeft3, 0.27314402793711257F, 0.22759093446006054F, 0.0F);
		this.clothR2 = new ModelRenderer(this, 40, 74);
		this.clothR2.setRotationPoint(-11.9F, -0.4F, 0.0F);
		this.clothR2.addBox(-10.0F, -2.0F, 0.0F, 10, 6, 0, 0.0F);
		this.setRotation(clothR2, 0.0F, 0.31869712141416456F, 0.0F);
		this.legRight2 = new ModelRenderer(this, 92, 23);
		this.legRight2.setRotationPoint(0.0F, 12.5F, 0.0F);
		this.legRight2.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
		this.setRotation(legRight2, 0.5235987755982988F, 0.0F, 0.0F);
		this.glaiveCannon2 = new ModelRenderer(this, 46, 106);
		this.glaiveCannon2.setRotationPoint(0.0F, 0.0F, 8.8F);
		this.glaiveCannon2.addBox(-1.0F, -4.0F, 0.0F, 2, 8, 3, 0.0F);
		this.setRotation(glaiveCannon2, 0.0F, -0.18203784098300857F, 0.0F);
		this.headBack = new ModelRenderer(this, 166, 18);
		this.headBack.setRotationPoint(0.0F, -1.8F, -2.1F);
		this.headBack.addBox(-2.5F, -5.4F, -0.05F, 5, 6, 2, 0.0F);
		this.setRotation(headBack, -0.6829473363053812F, 0.0F, 0.0F);
		this.waistGuardL5 = new ModelRenderer(this, 62, 52);
		this.waistGuardL5.setRotationPoint(3.6F, -0.1F, 0.0F);
		this.waistGuardL5.addBox(0.1F, -0.5F, -2.0F, 8, 1, 4, 0.0F);
		this.setRotation(waistGuardL5, 0.0F, 0.0F, 0.4553564018453205F);
		this.glaiveCannonSpike2 = new ModelRenderer(this, 44, 92);
		this.glaiveCannonSpike2.mirror = true;
		this.glaiveCannonSpike2.setRotationPoint(-0.3F, 5.5F, 2.3F);
		this.glaiveCannonSpike2.addBox(-1.0F, -2.5F, -2.5F, 2, 5, 5, 0.0F);
		this.setRotation(glaiveCannonSpike2, -0.7853981633974483F, 0.0F, 0.0F);
		this.floatyBackThingR2 = new ModelRenderer(this, 191, 69);
		this.floatyBackThingR2.mirror = true;
		this.floatyBackThingR2.setRotationPoint(-9.5F, -4.1F, 0.0F);
		this.floatyBackThingR2.addBox(-3.0F, -2.0F, -1.5F, 6, 4, 3, 0.0F);
		this.setRotation(floatyBackThingR2, 0.0F, 0.0F, -0.4553564018453205F);
		this.legLeft1 = new ModelRenderer(this, 92, 0);
		this.legLeft1.mirror = true;
		this.legLeft1.setRotationPoint(6.0F, 21.0F, 0.0F);
		this.legLeft1.addBox(-2.5F, -2.0F, -3.0F, 5, 15, 6, 0.0F);
		this.setRotation(legLeft1, -0.5235987755982988F, -0.6108652381980153F, 0.0F);
		this.clothL1 = new ModelRenderer(this, 40, 66);
		this.clothL1.setRotationPoint(0.0F, -0.4F, -0.6F);
		this.clothL1.addBox(0.0F, -2.0F, 0.0F, 12, 4, 0, 0.0F);
		this.setRotation(clothL1, 0.36425021489121656F, -0.22759093446006054F, 0.7285004297824331F);
		this.legLeft2 = new ModelRenderer(this, 92, 23);
		this.legLeft2.mirror = true;
		this.legLeft2.setRotationPoint(0.0F, 12.5F, 0.0F);
		this.legLeft2.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
		this.setRotation(legLeft2, 0.5235987755982988F, 0.0F, 0.0F);
		this.toeRightLeft = new ModelRenderer(this, 92, 106);
		this.toeRightLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.toeRightLeft.addBox(0.5F, 0.9F, -9.6F, 2, 2, 4, 0.0F);
		this.legRight1 = new ModelRenderer(this, 92, 0);
		this.legRight1.setRotationPoint(-6.0F, 21.0F, 0.0F);
		this.legRight1.addBox(-2.5F, -2.0F, -3.0F, 5, 15, 6, 0.0F);
		this.setRotation(legRight1, -0.5235987755982988F, 0.6108652381980153F, 0.0F);
		this.glaiveCannonProng2 = new ModelRenderer(this, 60, 103);
		this.glaiveCannonProng2.mirror = true;
		this.glaiveCannonProng2.setRotationPoint(-0.3F, 2.7F, -6.5F);
		this.glaiveCannonProng2.addBox(-1.0F, -3.0F, -8.5F, 2, 6, 16, 0.0F);
		this.setRotation(glaiveCannonProng2, -0.18203784098300857F, 0.0F, 0.0F);
		this.legRight5 = new ModelRenderer(this, 92, 65);
		this.legRight5.setRotationPoint(0.0F, 0.6F, 2.8F);
		this.legRight5.addBox(-2.08F, 0.0F, -2.5F, 4, 14, 5, 0.0F);
		this.setRotation(legRight5, -0.5918411493512771F, 0.0F, 0.0F);
		this.shoulderGuardRight1 = new ModelRenderer(this, 161, 73);
		this.shoulderGuardRight1.setRotationPoint(-11.0F, -1.8F, 4.5F);
		this.shoulderGuardRight1.addBox(0.0F, -4.5F, -4.0F, 3, 9, 8, 0.0F);
		this.setRotation(shoulderGuardRight1, 0.0F, 0.0F, 0.7285004297824331F);
		this.waistGuardR1 = new ModelRenderer(this, 49, 34);
		this.waistGuardR1.mirror = true;
		this.waistGuardR1.setRotationPoint(-4.0F, 1.3F, -0.1F);
		this.waistGuardR1.addBox(-1.0F, -5.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotation(waistGuardR1, -0.5462880558742251F, 0.0F, -0.7285004297824331F);
		this.waistGuardR3 = new ModelRenderer(this, 76, 34);
		this.waistGuardR3.mirror = true;
		this.waistGuardR3.setRotationPoint(0.0F, -7.5F, 2.3F);
		this.waistGuardR3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotation(waistGuardR3, 0.9105382707654417F, 0.0F, 0.0F);
		this.waistGuard4 = new ModelRenderer(this, 74, 9);
		this.waistGuard4.setRotationPoint(0.0F, 5.7F, 0.1F);
		this.waistGuard4.addBox(-3.0F, 0.0F, -1.0F, 6, 7, 2, 0.0F);
		this.setRotation(waistGuard4, -0.136659280431156F, 0.0F, 0.0F);
		this.clothR4 = new ModelRenderer(this, 107, 62);
		this.clothR4.setRotationPoint(-9.8F, -0.1F, -0.2F);
		this.clothR4.addBox(-11.1F, -0.5F, -6.5F, 11, 0, 13, 0.0F);
		this.setRotation(clothR4, 0.0F, 0.0F, -0.22759093446006054F);
		this.lForearm = new ModelRenderer(this, 129, 90);
		this.lForearm.mirror = true;
		this.lForearm.setRotationPoint(0.0F, 11.3F, 0.0F);
		this.lForearm.addBox(-2.0F, -2.0F, -12.0F, 4, 4, 12, 0.0F);
		this.setRotation(lForearm, 0.136659280431156F, 0.0F, 0.0F);
		this.shoulderGuardLeft2 = new ModelRenderer(this, 161, 102);
		this.shoulderGuardLeft2.mirror = true;
		this.shoulderGuardLeft2.setRotationPoint(0.0F, 0.0F, -1.0F);
		this.shoulderGuardLeft2.addBox(1.5F, -5.2F, -3.0F, 6, 4, 6, 0.0F);
		this.setRotation(shoulderGuardLeft2, 0.0F, 0.0F, -0.9105382707654417F);
		this.floatyBackThing1 = new ModelRenderer(this, 191, 45);
		this.floatyBackThing1.setRotationPoint(0.0F, -35.0F, 15.5F);
		this.floatyBackThing1.addBox(-5.0F, -4.0F, -1.5F, 10, 5, 3, 0.0F);
		this.floatyBackThingL4 = new ModelRenderer(this, 191, 89);
		this.floatyBackThingL4.setRotationPoint(3.4F, 8.4F, 0.0F);
		this.floatyBackThingL4.addBox(-2.0F, -4.0F, -1.5F, 4, 8, 3, 0.0F);
		this.setRotation(floatyBackThingL4, 0.0F, 0.0F, -0.136659280431156F);
		this.waistGuardL3 = new ModelRenderer(this, 76, 34);
		this.waistGuardL3.setRotationPoint(0.0F, -7.5F, 2.3F);
		this.waistGuardL3.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotation(waistGuardL3, 0.9105382707654417F, 0.0F, 0.0F);
		this.legRight4 = new ModelRenderer(this, 92, 53);
		this.legRight4.setRotationPoint(0.0F, -0.9F, 7.0F);
		this.legRight4.addBox(-2.0F, -2.2F, 1.9F, 4, 4, 3, 0.0F);
		this.setRotation(legRight4, -0.27314402793711257F, 0.0F, 0.0F);
		this.shoulderGuardLeft1 = new ModelRenderer(this, 161, 73);
		this.shoulderGuardLeft1.mirror = true;
		this.shoulderGuardLeft1.setRotationPoint(11.0F, -1.8F, 5.0F);
		this.shoulderGuardLeft1.addBox(-3.2F, -4.5F, -5.0F, 3, 9, 8, 0.0F);
		this.setRotation(shoulderGuardLeft1, 0.0F, 0.0F, -0.7285004297824331F);
		this.glaiveCannonSpike1 = new ModelRenderer(this, 44, 92);
		this.glaiveCannonSpike1.setRotationPoint(-0.3F, -5.5F, 2.3F);
		this.glaiveCannonSpike1.addBox(-1.0F, -2.5F, -2.5F, 2, 5, 5, 0.0F);
		this.setRotation(glaiveCannonSpike1, 0.7853981633974483F, 0.0F, 0.0F);
		this.floatyBackThingR2.addChild(this.floatyBackThingR3);
		this.neck.addChild(this.head);
		this.waistGuardR1.addChild(this.waistGuardR2);
		this.armRight1.addChild(this.rForearm);
		this.floatyBackThingR3.addChild(this.floatyBackThingR4);
		this.floatyBackDisc1.addChild(this.floatyBackDiscT);
		this.head.addChild(this.headBack2);
		this.abdomen.addChild(this.waist);
		this.head.addChild(this.mouthIGuess);
		this.floatyBackDisc1.addChild(this.floatyBackDiscR);
		this.shoulders.addChild(this.armLeft1);
		this.lForearm.addChild(this.armLeft2);
		this.floatyBackThing1.addChild(this.floatyBackDisc1);
		this.legLeft4.addChild(this.legLeft5);
		this.clothL3.addChild(this.clothL4);
		this.floatyBackDisc1.addChild(this.floatyBackDiscL);
		this.legLeft5.addChild(this.footLeft);
		this.footLeft.addChild(this.footLeftUpper);
		this.waistGuardR4.addChild(this.clothR3);
		this.glaiveCannon1.addChild(this.glaiveCannonFrame2);
		this.legRight2.addChild(this.legRight3);
		this.footRight.addChild(this.toeRightRight);
		this.rForearm.addChild(this.rFist);
		this.legLeft3.addChild(this.legLeft4);
		this.head.addChild(this.rSkullSlant2);
		this.waistGuard1.addChild(this.waistGuard2);
		this.rForearm.addChild(this.armRight2);
		this.chestUpper.addChild(this.breasts);
		this.waistGuard1.addChild(this.waistGuard3);
		this.footLeft.addChild(this.toeLeftRight);
		this.shoulderGuardRight1.addChild(this.shoulderGuardRight2);
		this.legRight5.addChild(this.footRight);
		this.floatyBackThingL.addChild(this.floatyBackThingL2);
		this.chestUpper.addChild(this.shoulders);
		this.glaiveCannon1.addChild(this.glaiveCannonProng1);
		this.floatyBackThing1.addChild(this.floatyBackThingL);
		this.head.addChild(this.headTendrilBundle);
		this.footLeft.addChild(this.toeLeftLeft);
		this.floatyBackDisc1.addChild(this.floatyBackDiscB);
		this.head.addChild(this.rSkullSlant);
		this.armLeft2.addChild(this.glaiveCannon1);
		this.floatyBackThingL2.addChild(this.floatyBackThingL3);
		this.headTendrilBundle.addChild(this.headTendrilBundle2);
		this.waistGuardL2.addChild(this.waistGuardL4);
		this.headTendrilBundle3.addChild(this.headTendrilBundle4);
		this.waistGuardL1.addChild(this.waistGuardL2);
		this.waistGuardR4.addChild(this.waistGuardR5);
		this.head.addChild(this.lSkullSlant2);
		this.floatyBackThing1.addChild(this.floatyBackThingR);
		this.waistGuardL4.addChild(this.clothL3);
		this.headTendrilBundle2.addChild(this.headTendrilBundle3);
		this.waistGuard1.addChild(this.waistGuardL1);
		this.waist.addChild(this.waistGuard1);
		this.shoulders.addChild(this.armRight1);
		this.head.addChild(this.lSkullSlant);
		this.waistGuardR2.addChild(this.waistGuardR4);
		this.waistGuardR1.addChild(this.clothR1);
		this.chestUpper.addChild(this.abdomen);
		this.glaiveCannon1.addChild(this.glaiveCannonFrame1);
		this.clothL1.addChild(this.clothL2);
		this.footRight.addChild(this.footRightUpper);
		this.head.addChild(this.eyes);
		this.legLeft2.addChild(this.legLeft3);
		this.clothR1.addChild(this.clothR2);
		this.legRight1.addChild(this.legRight2);
		this.glaiveCannon1.addChild(this.glaiveCannon2);
		this.head.addChild(this.headBack);
		this.waistGuardL4.addChild(this.waistGuardL5);
		this.glaiveCannon1.addChild(this.glaiveCannonSpike2);
		this.floatyBackThingR.addChild(this.floatyBackThingR2);
		this.waist.addChild(this.legLeft1);
		this.waistGuardL1.addChild(this.clothL1);
		this.legLeft1.addChild(this.legLeft2);
		this.footRight.addChild(this.toeRightLeft);
		this.waist.addChild(this.legRight1);
		this.glaiveCannon1.addChild(this.glaiveCannonProng2);
		this.legRight4.addChild(this.legRight5);
		this.shoulders.addChild(this.shoulderGuardRight1);
		this.waistGuard1.addChild(this.waistGuardR1);
		this.waistGuardR1.addChild(this.waistGuardR3);
		this.waistGuard3.addChild(this.waistGuard4);
		this.clothR3.addChild(this.clothR4);
		this.armLeft1.addChild(this.lForearm);
		this.shoulderGuardLeft1.addChild(this.shoulderGuardLeft2);
		this.floatyBackThingL3.addChild(this.floatyBackThingL4);
		this.waistGuardL1.addChild(this.waistGuardL3);
		this.legRight3.addChild(this.legRight4);
		this.shoulders.addChild(this.shoulderGuardLeft1);
		this.glaiveCannon1.addChild(this.glaiveCannonSpike1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f4, entity);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.neck.offsetX, this.neck.offsetY, this.neck.offsetZ);
		GlStateManager.translate(this.neck.rotationPointX * f5, this.neck.rotationPointY * f5, this.neck.rotationPointZ * f5);
		GlStateManager.scale(1.5D, 1.5D, 1.5D);
		GlStateManager.translate(-this.neck.offsetX, -this.neck.offsetY, -this.neck.offsetZ);
		GlStateManager.translate(-this.neck.rotationPointX * f5, -this.neck.rotationPointY * f5, -this.neck.rotationPointZ * f5);
		this.neck.render(f5);
		GlStateManager.popMatrix();
		this.chestUpper.render(f5);
		this.floatyBackThing1.render(f5);
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
		// super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks,
		// netHeadYaw, headPitch, scaleFactor, entityIn);
		head.rotateAngleX = par5 * 0.017453292F + 5.5F;
		head.rotateAngleY = par4 * 0.0017453292F;
		legLeft1.rotateAngleX = MathHelper.sin(par1 * 0.8662F) * 1 * par2 - 0.5F;
		legLeft2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1 * par2 + 0.5F;
		armLeft1.rotateAngleX = MathHelper.cos(par1 * 0.8662F + (float) Math.PI) * 0.5F * par2;
		legRight1.rotateAngleX = MathHelper.cos(par1 * 0.8662F) * 1 * par2 - 0.5F;
		legRight2.rotateAngleX = MathHelper.sin(par1 * 0.6662F) * 1 * par2 + 0.5F;
		armRight1.rotateAngleX = MathHelper.sin(par1 * 0.8662F + (float) Math.PI) * 0.5F * par2;
	}
}