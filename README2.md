# ZenboJuniorApp
This is an Android app developed for Asus Zenbo Junior Robot using embedded A.I. vision. Zenbo Junior is an AI-enabled robot platform with Android system developed by Asus, Inc. 
This app is able to perform gender, emotion and age detection in timely. 
I used android.hardware.camera2 package to invoke the system camera, and 
I used MobileNet as my neural network following [this paper](https://arxiv.org/pdf/1704.04861.pdf). I trained models using Tensorflow and converted them to [TFLite](https://www.tensorflow.org/lite) format
at the end. 

- Gender Model
  - Built on [IMDB - WIKI](https://data.vision.ee.ethz.ch/cvl/rrothe/imdb-wiki/) dataset which contains 500k+ celebrity faces
  - The model uses `Mobile_Net_v1_224_0.5` version of the MobileNet

- Emotion Model 
  - Built on [AffectNet](http://mohammadmahoor.com/affectnet/) model with more than 1M facial images in seven discrete facial expressions; it is the largest dataset of facial expressions
  - The model uses `Mobile_Net_v2_224_1.4` version of the MobileNet

- Age Model 
  - I followed the instruction of [this paper] (https://www.vision.ee.ethz.ch/en/publications/papers/proceedings/eth_biwi_01229.pdf)
  - Built on [UTKFace dataset](https://susanqq.github.io/UTKFace/) with 20k+ face images in the wild (only single face in one image)
  - The model uses `Mobile_Net_v2_224_1.00` version of the MobileNet 


You may find the presentation for this project at this link. 
You may find the demo for this project at this link. 

TODOs:
- [ ] Draw reactangles during face detection 
- [x] Optimize age model 
- [ ] New greeting after detecting different faces 
