# geo-clj

clojure geocode library

## Usage

Make sure you have set the environment variable `GOOGLE_APIKEY` 

### geocode an address:
(geo-clj.google/geocode "123 main street Fairhaven MA 02719")

### calculate distance between two distances
(geo-clj.distance/simple {:lat 41.0 :lng -70} {:lat 41.1 :lng -70.2})

## License

The MIT License (MIT)

Copyright (c) 2014 Matt Bowcock
