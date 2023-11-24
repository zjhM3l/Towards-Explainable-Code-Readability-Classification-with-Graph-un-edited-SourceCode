import os
import shutil
def migrateFiles(according_path, from_path, to_path):
    file_list = []
    for dirpath, dirnames, filenames in os.walk(according_path):
        for file_name in filenames:
            if file_name.endswith('.java'):
                pt_file_name = file_name + '.pt'
                if not os.path.exists(os.path.join(to_path, pt_file_name)):
                    src_file_path = os.path.join(from_path, pt_file_name)
                    dst_file_path = os.path.join(to_path, pt_file_name)
                    shutil.copy2(src_file_path, dst_file_path)



if __name__ == '__main__':
    according_path = "Dataset/readable"
    from_path = "newResults/dmon"
    to_path = "newResults/readable"
    file_names = migrateFiles(according_path, from_path, to_path)
    print("ok")