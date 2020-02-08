# ROOM NAMES CATEGORIES

### DELUXE (ROOM)

- SINGLE (TYPE)

        -NUMBER OF BEDS (1,2,3,4,5)

        -BED TYPE 
        
            SINGLE, 
            DOUBLE, 
            LARGE, 
            XTRA LARGE,
            BUNK

        -BED SIZE 

            SINGLE(90X130CM WIDE
            SINGLE(90X130CM WIDE
            SINGLE(90X130CM WIDE

        -MEAL PLANS

            -BED ONLY

            -BED & BREAKFAST

            -HALF BOARD (Breakfast & dinner incl.)

            -FULL BOARD (All meals incl.)

- DOUBLE

            -BED TYPE (SINGLE, DOUBLE, LARGE, XTRA LARGE, BUNK)

            -BED SIZE (SINGLE(90X130CM WIDE), DOUBLE(131X150CM WIDE))

- TWIN

            -BED TYPE (SINGLE, DOUBLE, LARGE, XTRA LARGE, BUNK)

            -BED SIZE (SINGLE(90X130CM WIDE), DOUBLE(131X150CM WIDE))

- TRIPPLE

- FAMILY SUITE

[CUSTOMER -> HOTEL -> ROOM -> ROOMTYPE -> (number_of_beds, bed_type, bed_size, meal_plan)]


# CUSTOMER (schema)

- HOTEL ID (generated)

- CUSTOMER NAME

- EMAIL ADDRESS (pk)

- PHONE NUMBER (alt pk)

- LOCATION (ADDRESS)

- MODE OF PAYMENT

- HAS_MANY_HOTELS (relationship btw customer & hotels)

# HOTEL INFORMATION (schema)

- Description of the hotel
- Facilities like swimming pool, spa, conference, gym, restaurant, bar
- Photos for slides
- What is nearby (surrounding area)
- Terms & Conditions

# NOTE

Acquire a new domain for a hotel-oriented branding e.g [http://reservationportal.com/panorama/rooms](Panorama website)







