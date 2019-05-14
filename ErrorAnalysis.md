## Error Analysis of Nearest Neighbors 

##### By Jonathan Riso

## Distributions of Model Accuracy

#### Variation in Accuracy

When running our Nearest Neighbors program on the Breast Cancer dataset, our accuracy would vary slightly from test to test due to the dataset being shuffled before every run which would cause our test set to be different every time.

#### Results

Upon running the Nearest Neighbors program on the Breast Cancer dataset 1000 times we obtained a mean 96.85%. A sensible baseline to test this model's performance would be against the frequencies found inside the data used.

## Analysis of different error types

#### False Positives and Negatives

A false positive occurs when our model indicates a positive result for something that should of been negative and a False Negative is the opposite.

#### Recall and Precision

Recall is the amount of True Positives over Total Positives(True and False Positives), the recall of our test was 95.60% which shows that only 4.40% of positives were false positives. Precision of our test is indicated by the Number of True positives over True Positives and False Negatives. Precision after 1000 runs was 95.42% which shows that only 4.58% of our positives were actually false negatives.

These results show that it may be wise to tune our hyper parameter up in order to reduce the amount of false positives and false negatives.