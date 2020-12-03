4- Geo
	(1)  API Key 
	/*
	->  An API key is a unique identifier that is used to authenticate requests associated with your project for 
		usage and billing purposes.
	-> The API key is tied to a digital certificate that links the app to its author.
	*/
	(2) Debug Certificate
	/*
	-> The Android SDK tools generates this certificate automatically when you do a debug build.
	-> Only use this certificate with apps that you're testing.
	-> Do not attempt to publish an app that's signed with a debug certificate. Because the debug certificate is
		created by the build tools and is insecure by design,
	*/
	(3) Release Certificate
	/*
	-> The Android SDK tools generates this for you when you do a release build.
	-> You can also generate this certificate using the key tool program.
	-> Use this certificate when you are ready to release your app into the world.
	*/
	(4) https://mapstyle.withgoogle.com/
	(5)
	/*
	-> GroundOverlay objects: A ground overlay is an image that is fixed to a map. Unlike markers, ground overlays 
		are oriented to the Earth's surface rather than to the screen. Rotating, tilting, or zooming the map changes 
		the orientation of the image.
	-> Ground overlays are useful when you wish to fix a single image in one area on the map.
	*/