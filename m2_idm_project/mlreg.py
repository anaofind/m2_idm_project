from sklearn.metrics import mean_absolute_error
from sklearn.model_selection import train_test_split
from sklearn import linear_model
import numpy as np
import pandas as pd
datas=pd.read_csv("test.csv",sep=",")
pred_cols=["Tailles","Poids"]
target_cols=["QI"]
targs=datas[target_cols]
preds=datas[pred_cols]
algo=linear_model.LinearRegression()
pred_train,pred_test,target_train,target_test=train_test_split(preds,targs,test_size=0.3)
algo.fit(pred_train,target_train)
predict=algo.predict(pred_test)
result=mean_absolute_error(target_test,predict)
print(result)
