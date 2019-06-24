# image-marking
This project is develop to help everyone to mark their images using their own marker

This image marking library is a java class that contains a static method for marking images (markImage ()). 
The markImage() method takes as argument the path of the image to be marked, the path of the mark, 
the output directory, the coordinates of the image and the opacity.

The arguments of the markImage method are:

- path Src: designates the path of the image to be marked (this path is a string) ;

- pathMaker: refers to the path of the image that will serve as the mark (this path is a string) ;

- pathDest: designates the directory path where the marked image will be saved (this path is a string);

- initAbs: designates the abscissa of departure of the mark (it is an integer) ;

- endAbs: designates the final abscissa of the mark (it's an integer);

- initOrd: designates the initial ordinate of the mark (it is an integer) ;

- endOrd: designates the final ordinate of the mark (it is an integer) ;

- opacity: Adjusts the transparency of the image (the values ??of this parameter are of type float and between (0.0f and 2.0f)) ;



The following is an example of calling the markImage () method with its parameters.

markImage ("source/a2.jpg", "source/logo.PNG", "output", 40, 200, 10,
180, 0.2f);