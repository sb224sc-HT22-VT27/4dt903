
"""
# Assignment 6 vj222hx
"""



"""
Loading and plotting the MNIST dataset
"""



from tensorflow.keras.datasets.mnist import load_data 
from tensorflow.keras.preprocessing.image import ImageDataGenerator
import matplotlib.pyplot as plt

(x_train, y_train), (x_test, y_test) = load_data()

print('Train: X=%s, y=%s' % (x_train.shape, y_train.shape)) 
print('Test: X=%s, y=%s' % (x_test.shape, y_test.shape))

for i in range(25):
    plt.subplot(5, 5, i+1)
    plt.imshow(x_test[i], cmap=plt.get_cmap('gray'))

plt.show()
# Classification: PREPROCESS




"""
Setting the sceene for image classification
"""



from numpy import zeros
from numpy import unique
from numpy import argmax
from numpy import asarray
from tensorflow.keras import Sequential
from tensorflow.keras.layers import Dense
from tensorflow.keras.layers import Conv2D
from tensorflow.keras.layers import MaxPool2D
from tensorflow.keras.layers import MaxPooling2D
from tensorflow.keras.layers import Flatten
from tensorflow.keras.layers import Dropout
from tensorflow.keras.callbacks import EarlyStopping 
from tensorflow.keras import Input
# Classification: PREPROCESS




orig_shape = x_train.shape[1:]
x_train = x_train.reshape((x_train.shape[0], x_train.shape[1], x_train.shape[2], 1))
x_test = x_test.reshape((x_test.shape[0], x_test.shape[1], x_test.shape[2], 1))
in_shape = x_train.shape[1:]
print("Before: {0}".format(orig_shape))
print("After: {0}".format(in_shape))
# Classification: TRAIN




n_classes = len(unique(y_train)) 
print("Classes: {0}".format(n_classes))
# Classification: TRAIN




x_train = x_train.astype('float32') / 255.0
x_test = x_test.astype('float32') / 255.0
# Classification: PREPROCESS




EPOCHS = 10
BATCH_SIZE = 128
early_stopping = EarlyStopping(
    monitor='val_accuracy',
    verbose=1,
    patience=10,
    mode='max', 
    restore_best_weights=True)
it = round(60000/BATCH_SIZE)
# Classification: PREDICT




def plot_metrics(history):
    colors = plt.rcParams['axes.prop_cycle'].by_key()['color'] 
    metrics = ['loss', 'accuracy'] 
    plt.figure(figsize=(10,5))
    for n, metric in enumerate(metrics):
        name = metric.replace("_"," ").capitalize()
        plt.subplot(1,2,n+1)
        plt.plot(history.epoch, history.history[metric], color=colors[0],label='Train')
        plt.plot(history.epoch, history.history['val_'+ metric],color=colors[0], linestyle="--", label='Val') 
        plt.xlabel('Epoch')
        plt.ylabel(name)
        if metric == 'loss':
            plt.ylim([0, plt.ylim()[1] +0.1]) 
        else:
            plt.ylim([-0.1,1.1])
        plt.legend()
# Classification: PREDICT




def print_res(model): 
    err = 0
    i_range = 10
    ys = zeros(i_range * i_range) 
    class bcolors:
        FAIL = '\033[91m'
        ENDC = '\033[0m' 
    for i in range(i_range):
        for j in range(i_range):
            idx = i*i_range+j
            image = x_test[idx]
            yhat = model.predict(asarray([image]))
            ys[idx] = argmax(yhat) 
            print('%d ' % ys[idx], end = '')
        print()
    print("--")
    for i in range(i_range): 
        for j in range(i_range):
            idx = i*i_range+j; 
            y = y_test[idx] 
            if y==ys[idx]:
                print('%d ' % y, end = '')
            else:
                err = err + 1
                print(f"{bcolors.FAIL}%d {bcolors.ENDC}" % y, end = '') 
        print()
    return err
# Classification: TRAIN




"""
## Model without data augmentation

I will begin by tuning the parameters without data augmentation. I will do this by reducing the parameter count in the dense layer and add it to the CNN layer and playing around with the pooling layer. I will also try adding a nother CNN and pooling layer and tuning the parameters here. I do this because the dense layer has a lot of parameters per points of accuracy increase and then I will use the other parts to compensate. 
"""



def make_model1(add_dense=False):
    model = Sequential()
    model.add(Input(shape=in_shape))
    model.add(Conv2D(32, (9, 9), activation='relu'))
    model.add(MaxPooling2D((4, 4)))
    model.add(Flatten())
    if add_dense:
        model.add(Dense(30, activation='relu'))
        model.add(Dropout(0.2))
    model.add(Dense(n_classes, activation='softmax')) 
    model.compile(optimizer='adam', loss='sparse_categorical_crossentropy',metrics=['accuracy'])
    return model

model = make_model1(False)
model.summary()
# Classification: PREPROCESS




model_history = model.fit(
    x_train,
    y_train,
    epochs=EPOCHS,
    callbacks = [early_stopping],
    validation_data=(x_test, y_test),
    batch_size=BATCH_SIZE)
# Classification: PREPROCESS




plot_metrics(model_history)
loss, acc = model.evaluate(x_test, y_test, verbose=0)
print('Accuracy: %.3f' % acc)
err = print_res(model)
# Classification: PREPROCESS




"""
After playing around with parameters I found that the dense layer has very little impact so I removed it all together. For the other parameters I found that having a depth of 32, a CNN kernel width of 9 and a pool stride of 4 gave a good result, giving me an accuracy of 0.990 with a parameter count of 10634 which is roughly 50x less than the teacher. Adding an additional layer added parameter count with no increase in accuracy

## Model with data augmentation

When adding data augmentation I might have to add parameters and potentially bring back the dense layer to compensate for a wider variaty of data. Data augmentation takes the training data and adds variation to it by applying random zoom, rotation and flips it. This creates a lot of new training data to hopefully improve performance.  
"""



def make_model2(add_dense=False):
    model = Sequential()
    model.add(Input(shape=in_shape))
    model.add(Conv2D(64, (5, 5), activation='relu'))
    model.add(MaxPooling2D((4, 4)))
    model.add(Conv2D(16, (3, 3), activation='relu'))
    model.add(MaxPooling2D((2, 2)))
    model.add(Flatten())
    if add_dense:
        model.add(Dense(100, activation='relu'))
        model.add(Dropout(0.3))
    model.add(Dense(n_classes, activation='softmax')) 
    model.compile(optimizer='adam', loss='sparse_categorical_crossentropy',metrics=['accuracy'])
    return model

# 32, 7, 4
model = make_model2(True)
model.summary()
# Classification: PREDICT




# data Augmentation
datagen = ImageDataGenerator(
    zoom_range=0.1,
    rotation_range=10,
    horizontal_flip=True
)

train_generator = datagen.flow(x_train, y_train, batch_size=16)

model_history = model.fit(
    train_generator,
    epochs=EPOCHS,
    callbacks = [early_stopping],
    validation_data=(x_test, y_test),
    batch_size=BATCH_SIZE)
# Classification: TRAIN




"""
When using data augmentation I didn't manage to get as good of an accuracy and it is using more parameters. However the best score I managed to get does use two CNN layers with different parameters and the dense layer.
"""


