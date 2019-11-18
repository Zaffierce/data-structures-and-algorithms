# Left Join
Implement a left join on 2 hashmaps.

## Challenge
Implement a left join on 2 hashmaps.  If data is not found in second hashmap, return that value as NULL.

Input: 
```
hashmap one               hashmap two

fond : enamored           fond : averse
wrath : anger             wrath : delight
diligent : employed       diligent : idle
outfit : garb             guide : follow
guide : usher             flow : jam
```


Output:
```
[
 [fond, enamored, averse]
 [wrath, anger, delight]
 [diligent, employed, idle]
 [outfit, garb, NULL]
 [guide, usher, follow]
]
```

## Approach & Efficiency
Approach was to create a new array based on hashmap one's size, then iterate through hashmap two seeing if like values exist.  If it doesn't exist in two, return that value as a NULL.

## Solution
![](../../../../../../assets/left-join.jpg) 