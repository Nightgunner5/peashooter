/**
 * Copyright 2011 The PlayN Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package net.llamaslayers.peashooter.core.entities;

import net.llamaslayers.peashooter.core.PeaWorld;
import playn.core.Image;

public class FakeBlock extends Entity {

	public static String TYPE = "FakeBlock";

	public FakeBlock( PeaWorld peaWorld, float x, float y, float angle ) {
		super( peaWorld, x, y, angle );
	}

	@Override
	public void paint( float alpha ) {
	}

	@Override
	public void update( float delta ) {
	}

	@Override
	public void setPos( float x, float y ) {
		layer.setTranslation( x, y );
	}

	@Override
	public void setAngle( float a ) {
		layer.setRotation( a );
	}

	@Override
	float getWidth() {
		return 2.0f;
	}

	@Override
	float getHeight() {
		return 2.0f;
	}

	@Override
	public void initPreLoad( PeaWorld peaWorld ) {
		peaWorld.staticLayerBack.add( layer );
	}

	@Override
	public void initPostLoad( PeaWorld peaWorld ) {
	}

	@Override
	public Image getImage() {
		return image;
	}
	private static Image image = loadImage( "Block-Normal.png" );
}
