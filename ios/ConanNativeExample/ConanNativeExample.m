//
//  ConanNativeExample.m
//  ConanNativeExample
//
//  Created by ConanChen on 2017/7/24.
//  Copyright © 2017年 Chen.Conan. All rights reserved.
//

#import "ConanNativeExample.h"

@implementation ConanNativeExample

RCT_EXPORT_MODULE(ConanExample);

RCT_EXPORT_METHOD(showlog:(RCTResponseSenderBlock)callback){
    callback(@[@"Error"]);
}

@end
