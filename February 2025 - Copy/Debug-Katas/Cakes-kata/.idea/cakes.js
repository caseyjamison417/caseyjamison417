function cakes (recipe, available){
    // loop thru ingredients in recipe
    //check and see if ingredient is in available 
            //if not there, return 0
            // else
                //find out how many numberOfCakes can make => available / recipe

                //Math.floor to get the whole number? 
                //Store that lowest number in recipe (overwrite)

                // create a variable lowest 
                //loop thru recipe 
                // if value in recipe is smaller than lowest
                    //lowest = value in recipe 



                //return lowest

                for(const key in recipe){
                    if(!key in available){ // in returns true or false
                        return 0;
                    }

                    let availableAmt = available[key];
                    let recipeAmt = recipe[key];
                    let maxNumberOfCakes = Math.floor(availableAmt / recipeAmt);
                    recipe[key] = maxNumberOfCakes;
                }

                let lowest = 20000;
                for (const key in recipe){
                    if(recipe[key] < lowest){
                        lowest = recipe[key];
                    }
                }
            return lowest;
}